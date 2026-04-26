import java.util.*;

class union_sorted_array68 {
  public static List<Integer> union_sorted_array(int[] nums, int[] nums2, int n1, int n2) {
    Map<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < n1; i++) {
      mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
    }
    for (int i = 0; i < n2; i++) {
      mpp.put(nums2[i], mpp.getOrDefault(nums[i], 0) + 1);
    }
    List<Integer> union = new ArrayList<>();
    for (int num : mpp.keySet()) {
      union.add(num);
    }
    return union;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n1 Size of array");
    int n1 = sc.nextInt();
    int arr[] = new int[n1];
    System.out.println("Enter n2 Size of array");
    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    System.out.println("Enter n1 elements in array");
    for (int i = 0; i < n1; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter n2 elements in array");
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }
    List<Integer> result = union_sorted_array(arr, arr2, n1, n2);
    for (int val : result)
      System.out.print(val + " ");
    sc.close();
  }
}
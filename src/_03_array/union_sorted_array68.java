import java.util.*;

class unionSort {
  public List<Integer> union_sorted_array(int[] arr1, int[] arr2, int n, int m) {
    List<Integer> Union = new ArrayList<>();

    // Initialize pointers
    int i = 0, j = 0;

    // Iterate while both arrays have elements
    while (i < n && j < m) {
      // If element in arr1 is smaller
      if (arr1[i] < arr2[j]) {
        // Add if empty or not duplicate
        if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
          Union.add(arr1[i]);
        i++; // Move pointer in arr1
      }
      // If element in arr2 is smaller
      else if (arr2[j] < arr1[i]) {
        // Add if empty or not duplicate
        if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
          Union.add(arr2[j]);
        j++; // Move pointer in arr2
      } else {
        // Elements are equal, add once if not duplicate
        if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
          Union.add(arr1[i]);
        i++;
        j++; // Move both pointers
      }
    }

    // Append remaining elements from arr1
    while (i < n) {
      if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
        Union.add(arr1[i]);
      i++;
    }

    // Append remaining elements from arr2
    while (j < m) {
      if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
        Union.add(arr2[j]);
      j++;
    }

    // Return the union list
    return Union;
  }
}
// class Solution {
// public List<Integer> union_sorted_array(int[] nums, int[] nums2, int n1, int
// n2) {
// Set<Integer> st = new TreeSet<>();
// for (int i = 0; i < n1; i++) {
// st.add(nums[i]);
// }
// for (int i = 0; i < n2; i++) {
// st.add(nums[i]);
// }
// return new ArrayList<>(st);
// }
// }

class union_sorted_array68 {
  // public static List<Integer> union_sorted_array(int[] nums, int[] nums2, int
  // n1, int n2) {
  // Map<Integer, Integer> mpp = new HashMap<>();
  // for (int i = 0; i < n1; i++) {
  // mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
  // }
  // for (int i = 0; i < n2; i++) {
  // mpp.put(nums2[i], mpp.getOrDefault(nums[i], 0) + 1);
  // }
  // List<Integer> union = new ArrayList<>();
  // for (int num : mpp.keySet()){
  // union.add(num);
  // }
  // return union;
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    unionSort obj = new unionSort();
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
    List<Integer> result = obj.union_sorted_array(arr, arr2, n1, n2);
    for (int val : result)
      System.out.print(val + " ");
    sc.close();
  }
}
import java.util.Scanner;

class majorityElement {
  public int majElement(int[] arr) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // int count = 0;
    // for (int j = 0; j < n; j++) {
    // if (arr[j] == arr[i]) {
    // count++;
    // }
    // }
    // if (count > n / 2) {
    // return arr[i];
    // }
    // }
    // return -1;
    // int n = arr.length;
    // Map<Integer, Integer> mpp = new HashMap<>();
    // for (int num : arr) {
    // mpp.put(num, mpp.getOrDefault(num, 0) + 1);
    // }
    // for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
    // if (entry.getValue() > n / 2) {
    // return entry.getKey();
    // }
    // }
    // return -1;
    int n = arr.length;
    int count = 0;
    int elmnt = 0;
    for (int i = 0; i < n; i++) {
      if (count == 0) {
        elmnt = arr[i];
        count++;
      } else if (arr[i] == elmnt) {
        count++;
      } else {
        count--;
      }
    }
    int count1 = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == elmnt)
        count1++;
    }
    if (count1 > n / 2)
      return elmnt;
    else
      return -1;
  }
}

class majority_element76 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    majorityElement sol = new majorityElement();
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("majority element n/2 is: ");
    System.out.println(sol.majElement(arr));
    sc.close();
  }
}

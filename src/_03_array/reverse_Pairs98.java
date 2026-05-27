import java.util.Scanner;

class pairs {
  public int reversePairs(int[] arr) {
    int n = arr.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > 2 * arr[j]) {
          count++;
        } else
          continue;
      }
    }
    return count;
  }
}

class reverse_Pairs98 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    pairs sol = new pairs();
    System.out.println("Enter size of the give array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("reverse pairs is: ");
    System.out.println(sol.reversePairs(arr));
    sc.close();
  }
}
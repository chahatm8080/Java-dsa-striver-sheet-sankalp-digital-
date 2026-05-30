import java.util.Scanner;

class maxPro {
  public int maxProduct(int[] nums) {
    int maxProd = nums[0];

    for (int i = 0; i < nums.length; i++) {

      int prod = 1;

      for (int j = i; j < nums.length; j++) {

        prod *= nums[j];
        maxProd = Math.max(maxProd, prod);
      }
    }

    return maxProd;
  }
}

class max_Product99 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    maxPro sol = new maxPro();
    System.out.println("enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(sol.maxProduct(arr));
    sc.close();
  }
}
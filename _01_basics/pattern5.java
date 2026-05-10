public class pattern5 {
  public void pattern(int n) {
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern5 sol = new pattern5();
    int N = 5;
    sol.pattern(N);
  }
}

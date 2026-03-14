public class pattern12 {
  public void pattern(int n) {
    int spaces = 2 * n - 2;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
      spaces -= 2;
    }
  }

  public static void main(String[] args) {
    pattern12 solu = new pattern12();
    int N = 5;
    solu.pattern(N);
  }
}

public class pattern19 {
  public void pattern(int n) {
    int iniS = 0;

    for (int i = 0; i < n; i++) {

      // left stars
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }

      // spaces
      for (int j = 0; j < iniS; j++) {
        System.out.print(" ");
      }

      // right stars
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }

      iniS += 2;
      System.out.println();
    }

    iniS = 2 * n - 2;

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < iniS; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      iniS -= 2;
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern19 solu = new pattern19();
    int N = 6;
    solu.pattern(N);
  }
}

public class pattern3 {
  public void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern3 sol = new pattern3();
    int N = 5;
    sol.pattern1(N);
  }
}

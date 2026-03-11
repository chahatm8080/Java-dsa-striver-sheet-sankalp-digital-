
public class pattern4 {
  public void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern4 sol = new pattern4();
    int N = 5;
    sol.pattern1(N);
  }
}

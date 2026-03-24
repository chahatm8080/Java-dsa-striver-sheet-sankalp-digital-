public class recursion_print1ton43 {
  public void print1ton(int current, int n) {
    if (current > n) {
      return;
    }
    System.out.println(current);
    print1ton(current + 1, n);
  }

  public static void main(String[] args) {
    recursion_print1ton43 sol = new recursion_print1ton43();
    int n = 5;
    sol.print1ton(1, n);
  }
}

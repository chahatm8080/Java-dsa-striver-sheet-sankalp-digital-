public class pattern26 {
  static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      char ch = 'A';
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      int breakpoint = (2 * i + 1) / 2;
      for (int j = 1; j <= 2 * i + 1; j++) {
        System.out.print(ch);
        if (j <= breakpoint)
          ch++;
        else
          ch--;
      }
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 3;
    pattern(n);
  }
}

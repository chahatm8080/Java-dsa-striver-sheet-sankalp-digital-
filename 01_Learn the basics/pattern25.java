public class pattern25 {
  static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      char ch = (char) ('A' + i);
      for (int j = 0; j <= i; j++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 5;
    pattern(n);
  }
}

public class pattern16 {
  public void pattern(int n) {
    for (int i = 0; i < n; i++) {
      char ch = (char) ('A' + i);
      for (int j = 0; j <= i; j++) {
        System.out.print(ch + "");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern16 solu = new pattern16();
    int N = 6;
    solu.pattern(N);
  }
}

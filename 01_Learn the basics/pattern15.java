public class pattern15 {
  public void pattern(int n) {
    for (int i = n; i > 0; i--) {
      for (char ch = 'A'; ch < 'A' + i; ch++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern15 solu = new pattern15();
    int N = 6;
    solu.pattern(N);
  }
}

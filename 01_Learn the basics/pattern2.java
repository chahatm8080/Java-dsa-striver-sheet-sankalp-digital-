class pattern2 {
  public void pattern1(int N) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern2 sol = new pattern2();
    int N = 5;
    sol.pattern1(N);
  }
}

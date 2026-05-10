class pattern13 {
  public void pattern(int N) {
    int num = 1;
    for (int i = 1; i <= N; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num += 1;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // Creating object of Solution class
    pattern13 sol = new pattern13();

    int N = 5;

    // Calling pattern function
    sol.pattern(N);
  }
}

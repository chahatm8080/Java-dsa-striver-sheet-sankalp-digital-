public class pattern31 {
  static void pattern(int n) {
    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < 2 * n - 1; j++) {
        // yaha basically top left right bottom ye sab distance pata karne ke liye hai
        // isliye i distance se or j distance se minus kar rahe hai ...thoda dhyaan se
        // sochoge to solution mil jaayega;
        int top = i;
        int left = j;
        int right = (2 * n - 2) - j;// (2*n-1)-1-j;
        int bottom = (2 * n - 2) - i;// (2*n-1)-1-i;
        int min_distance = Math.min(Math.min(left, right), Math.min(top, bottom));
        System.out.print(n - min_distance);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 4;
    pattern(n);
  }
}

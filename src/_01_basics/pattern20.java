public class pattern20 {
  public void pattern(int n) {
    int spaces = 2 * n - 2;

    // Loop for rows
    for (int i = 1; i <= 2 * n - 1; i++) {
      // Calculate stars for first half
      int stars = i;

      // Adjust stars for second half
      if (i > n)
        stars = 2 * n - i;

      // Print left stars
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }

      // Print spaces
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // Print right stars
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }

      // Move to next line
      System.out.println();

      // Adjust spaces for next row
      if (i < n)
        spaces -= 2;
      else
        spaces += 2;
    }
  }

  public static void main(String[] args) {
    pattern20 solu = new pattern20();
    int N = 6;
    solu.pattern(N);
  }
}
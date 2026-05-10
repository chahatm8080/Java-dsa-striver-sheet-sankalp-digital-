import java.util.Scanner;

public class rev_number35 {
  public int reverse(int x) {
    int rev = 0;

    while (x != 0) {

      int digit = x % 10;
      x = x / 10;

      // overflow check
      if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
        return 0;
      }

      rev = rev * 10 + digit;
    }

    return rev;
  }

  public static void main(String[] args) {
    rev_number35 sol = new rev_number35();
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    System.out.println(sol.reverse(x));
    input.close();
  }
}

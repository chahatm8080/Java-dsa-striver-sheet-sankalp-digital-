import java.util.Scanner;

class count_digit34 {
  public void countDigits(int n) {
    int cnt = 0;

    while (n > 0) {
      cnt++;
      n = n / 10;
    }
    System.out.println("Number of Digits in N: " + cnt);
  }

  public static void main(String[] args) {
    count_digit34 sol = new count_digit34();
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    sol.countDigits(N);
    input.close();
  }
}
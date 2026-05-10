import java.util.Scanner;

class palindrome36 {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        if (rev == x)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        palindrome36 sol = new palindrome36();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(sol.isPalindrome(x));
        input.close();
    }
}
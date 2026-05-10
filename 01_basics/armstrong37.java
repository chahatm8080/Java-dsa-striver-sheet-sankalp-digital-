import java.util.Scanner;

class armstrong37 {
    public boolean isArmstrong(int x) {
        int n = x;
        int total = 0;
        while (n > 0) {
            int ld = n % 10;
            total += ld * ld * ld;
            n = n / 10;
        }
        if (x == total)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        armstrong37 sol = new armstrong37();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(sol.isArmstrong(x));
        input.close();
    }
}
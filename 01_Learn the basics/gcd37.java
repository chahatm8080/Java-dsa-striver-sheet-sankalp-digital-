public class gcd37 {
    public int gcd_Finding(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0)
            return b;
        else
            return a;
    }

    public static void main(String[] args) {
        gcd37 obj = new gcd37();
        int num1 = 20, num2 = 15;
        System.out.println(obj.gcd_Finding(num1, num2));

    }
}
public class recursion_sumOfNumber {
    public int sumOfNaturalNumbers(int N) {
        if (N == 1) {
            return 1;
        }
        return N + sumOfNaturalNumbers(N - 1);
    }

    public static void main(String[] args) {
        recursion_sumOfNumber obj = new recursion_sumOfNumber();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(obj.sumOfNaturalNumbers(N));
        sc.close();
    }
}
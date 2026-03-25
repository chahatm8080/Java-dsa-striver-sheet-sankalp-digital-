public class recursion_factorial {
    public int factorial(int N) {
        if (N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        recursion_factorial obj = new recursion_factorial();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(obj.factorial(N));
        sc.close();
    }
}
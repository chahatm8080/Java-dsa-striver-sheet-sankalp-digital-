public class fibonacci_Series {
    public int fibonacci(int N) {
        // Base case: return N if it's 0 or 1
        if (N <= 1) {
            return N;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    public static void main(String[] args) {
        fibonacci_Series obj = new fibonacci_Series();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(obj.fibonacci(N));
        sc.close();
    }
}
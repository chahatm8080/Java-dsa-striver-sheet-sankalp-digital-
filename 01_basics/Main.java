class prime40 {
    // Function to check if a given number is prime
    public boolean checkPrime(int n) {
        int cnt = 0; // Initialize a counter variable to count the number of factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                /*
                 * 1.Agar dono factors alag hain tabhi second factor count karo
                 * 2.√n tak isliye jaate hain kyunki factors pair me milte hain
                 * 3.n/i != i isliye check karte hain taaki perfect square me middle factor
                 * double count na ho
                 */
                if (n / i != i) {
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 1483;
        prime40 obj = new prime40();
        boolean isPrime = obj.checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
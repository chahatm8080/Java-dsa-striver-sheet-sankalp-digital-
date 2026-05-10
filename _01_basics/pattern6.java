class pattern6 {
    public void pattern(int N) {
        for (int i = 0; i < N; i++) {
            // Prints numbers from 1 up to (N - i)
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }
            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating object of Solution class
        pattern6 sol = new pattern6();

        int N = 5;

        // Calling pattern function
        sol.pattern(N);
    }
}

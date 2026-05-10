class pattern9 {
    public void pattern(int N) {
        for (int i = 0; i < N; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < N * 2 - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Print trailing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern2(int N) {
        for (int i = 0; i < N; i++) {
            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating object of Solution class
        pattern9 sol = new pattern9();

        int N = 5;

        // Calling pattern function
        sol.pattern2(N);
        sol.pattern(N);
    }
}

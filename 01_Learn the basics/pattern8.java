class pattern8 {
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

    public static void main(String[] args) {
        // Creating object of Solution class
        pattern8 sol = new pattern8();

        int N = 5;

        // Calling pattern function
        sol.pattern(N);
    }
}

class pattern14 {
    public void pattern(int N) {
        for (int i = 0; i < N; i++) {

            // Inner loop to print alphabets from A to A + i
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating object of Solution class
        pattern14 sol = new pattern14();

        int N = 5;

        // Calling pattern function
        sol.pattern(N);
    }
}

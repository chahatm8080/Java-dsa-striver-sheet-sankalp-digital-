public class printnto1_35 {
    public void printNumbers(int current) {
        if (current < 1)
            return;
        System.out.print(current + " ");

        printNumbers(current - 1);
    }

    public static void main(String[] args) {
        printnto1_35 sol = new printnto1_35();
        int n = 10;

        sol.printNumbers(n);
        System.out.println();
    }
}

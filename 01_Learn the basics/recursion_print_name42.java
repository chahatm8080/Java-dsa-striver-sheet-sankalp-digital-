public class recursion_print_name {
  public void printName(String name, int count, int N) {
    if (count == N) {
      return;
    }
    System.out.println(name);
    printName(name, count + 1, N);
  }

  public static void main(String[] args) {
    recursion_print_name sol = new recursion_print_name();
    int n = 5;
    String name = "chahat";
    sol.printName(name, 0, n);

  }
}


import java.util.Scanner;

public class reverseString {

  public static boolean rotateString(String s, String goal) {
    return s.length() == goal.length() && (s + s).contains(goal);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String s = sc.nextLine();

    System.out.print("Enter second string: ");
    String goal = sc.nextLine();

    boolean result = rotateString(s, goal);

    System.out.println(result);

    sc.close();
  }
}

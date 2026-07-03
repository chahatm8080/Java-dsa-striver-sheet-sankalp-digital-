import java.util.Arrays;
import java.util.Scanner;

class prefix {

  public String longestCommonPrefix(String[] strs) {
    StringBuilder ans = new StringBuilder();

    Arrays.sort(strs);

    String first = strs[0];
    String last = strs[strs.length - 1];

    for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
      if (first.charAt(i) != last.charAt(i)) {
        return ans.toString();
      }
      ans.append(first.charAt(i));
    }

    return ans.toString();
  }
}

public class largestComonPrefix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    prefix obj = new prefix();

    System.out.print("Enter number of strings: ");
    int n = sc.nextInt();
    sc.nextLine(); // Consume newline

    String[] strs = new String[n];

    System.out.println("Enter the strings:");
    for (int i = 0; i < n; i++) {
      strs[i] = sc.nextLine();
    }
    String result = obj.longestCommonPrefix(strs);
    System.out.println("Longest Common Prefix: " + result);
  }
}

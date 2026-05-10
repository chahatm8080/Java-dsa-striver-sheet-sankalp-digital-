import java.util.Scanner;

class Solution {
  public boolean string_Palindrome(String st) {
    int l = 0;
    int r = st.length() - 1;
    while (l < r) {
      if (!Character.isLetterOrDigit(st.charAt(l))) {
        l++;
      } else if (!Character.isLetterOrDigit(st.charAt(r))) {
        r--;
      } else if (Character.toLowerCase(st.charAt(l)) != Character.toLowerCase(st.charAt(r))) {
        return false;
      } else {
        l++;
        r--;
      }
    }
    return true;
  }
}

public class check_String_Palindrome {
  public static void main(String[] args) {
    Solution solution = new Solution();
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    System.out.println(solution.string_Palindrome(st));
    sc.close();
  }
}

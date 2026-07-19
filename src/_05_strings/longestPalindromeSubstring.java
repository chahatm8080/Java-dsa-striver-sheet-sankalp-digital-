import java.util.Scanner;

class longest {
  public boolean palindrome(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public String longestPalindrome(String str, int n) {
    String ans = "";
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (palindrome(str, i, j)) {
          if (j - i + 1 > ans.length()) {
            ans = str.substring(i, j + 1);
          }
        }
      }
    }
    return ans;
  }
}

class longestPalindromeSubstring {
  public static void main(String[] args) {
    longest lo = new longest();

    String s = "dabasac";

    int n = s.length();

    System.out.print(lo.longestPalindrome(s, n));
  }
}

import java.util.Scanner;

class Solution {
  public boolean isAnagram(String s, String t) {
    int[] feqs = new int[26];
    if (s.length() != t.length())
      return false;
    for (int i = 0; i < s.length(); i++) {
      feqs[s.charAt(i) - 'a']++;
      feqs[t.charAt(i) - 'a']--;
    }
    for (int it : feqs) {
      if (it != 0)
        return false;
    }
    return true;
  }
}

class valid_anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String s = sc.next();

    System.out.print("Enter second string: ");
    String t = sc.next();

    Solution obj = new Solution();

    if (obj.isAnagram(s, t)) {
      System.out.println("Strings are Anagrams");
    } else {
      System.out.println("Strings are NOT Anagrams");
    }

    sc.close();
  }
}
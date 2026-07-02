import java.util.*;

class reverse {

  public String reverseWordsString(String s) {
    String[] Words = s.trim().split(" ");
    StringBuilder ans = new StringBuilder();
    for (int i = Words.length - 1; i >= 0; i--) {
      ans.append(Words[i]);
      ans.append(" ");
    }
    return ans.substring(0, ans.length() - 1).toString();
  }
}

class reverseWordsString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    reverse obj = new reverse();

    System.out.println(obj.reverseWordsString(s));

    sc.close();
  }
}
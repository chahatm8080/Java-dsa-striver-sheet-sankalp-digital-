import java.util.*;

class odd {

  public String largeOddStr(String num) {
    if ((int) num.charAt(num.length() - 1) % 2 == 1)
      return num;
    int i = num.length() - 1;
    while (i >= 0) {
      int n = num.charAt(i);
      if (n % 2 == 1)
        return num.substring(0, i + 1);
      i--;
    }
    return "";
  }
}

class largestOddNumString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    odd obj = new odd();

    System.out.println(obj.largeOddStr(s));

    sc.close();
  }
}
import java.util.*;

class isomorphi {
  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length())
      return false;
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char real = s.charAt(i);
      char replaced = t.charAt(i);
      if (!map.containsKey(real)) {
        if (!map.containsValue(replaced)) {
          map.put(real, replaced);
        } else
          return false;
      } else {
        char charMapped = map.get(real);
        if (charMapped != replaced)
          return false;
      }
    }
    return true;
  }
};

class isomorphicString {
  public static void main(String[] args) {
    isomorphi sol = new isomorphi();
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter s string");
    String s = sc.nextLine();
    System.out.println("Enter t string");
    String t = sc.nextLine();
    System.out.println(sol.isIsomorphic(s, t));
    sc.close();
  }
}

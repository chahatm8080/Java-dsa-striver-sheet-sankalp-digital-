import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

class sort {
  public String sortCharacter(String s) {
    HashMap<Character, Integer> freq = new HashMap<>();
    for (char c : s.toCharArray()) {
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
    maxHeap.addAll(freq.keySet());
    StringBuilder result = new StringBuilder();
    while (!maxHeap.isEmpty()) {
      char current = maxHeap.remove();
      for (int i = 0; i < freq.get(current); i++) {
        result.append(current);
      }
    }
    return result.toString();
  }
}

class sortCharactersByFrequency {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sort sol = new sort();
    System.out.print("Enter first string: ");
    String s = sc.nextLine();
    System.out.println(
        sol.sortCharacter(s));

    sc.close();
  }
}

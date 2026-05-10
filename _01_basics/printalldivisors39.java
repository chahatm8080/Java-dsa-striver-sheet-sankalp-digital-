import java.util.*;

class printalldivisors39 {
  public List<Integer> getDivisors(int N) {
    List<Integer> res = new ArrayList<>();
    for (int i = 1; i * i < N; i++) {
      if (N % i == 0) {
        res.add(i);
        if (i != N / i) {
          res.add(N / i);
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    printalldivisors39 obj = new printalldivisors39();
    int n = 36;
    List<Integer> result = obj.getDivisors(n);
    for (int val : result) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}
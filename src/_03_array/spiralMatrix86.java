import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class spiral {
  List<Integer> spiralMatrix(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int rowBegin = 0, rowEnd = m - 1;
    int colBegin = 0, colEnd = n - 1;
    List<Integer> res = new ArrayList<>();
    while (rowBegin <= rowEnd && colBegin <= colEnd) {
      for (int i = colBegin; i <= colEnd; i++) {
        res.add(matrix[rowBegin][i]);
      }
      rowBegin++;
      for (int i = rowBegin; i <= rowEnd; i++) {
        res.add(matrix[i][colEnd]);
      }
      colEnd--;
      if (rowBegin <= rowEnd) {
        for (int i = colEnd; i >= colBegin; i--) {
          res.add(matrix[rowEnd][i]);
        }
      }
      rowEnd--;
      if (colBegin <= colEnd) {
        for (int i = rowEnd; i >= rowBegin; i--) {
          res.add(matrix[i][colBegin]);
        }
      }
      colBegin++;
    }
    return res;
  }
}

class spiralMatrix86 {
  public static void main(String[] args) {
    spiral sp = new spiral();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of m rows");
    int m = sc.nextInt();
    System.out.println("Enter size of n rows");
    int n = sc.nextInt();
    System.out.println("Enter elements into matrix");
    int[][] matrix = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    List<Integer> ans = sp.spiralMatrix(matrix);
    System.out.print(ans);
    sc.close();
  }
}

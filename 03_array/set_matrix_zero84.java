import java.util.Scanner;

class Solution {
  public int[][] matrixZero(int[][] matrix, int m, int n) {
    boolean firstRow = false;
    boolean firstColumn = false;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          if (i == 0)
            firstRow = true;
          if (j == 0)
            firstColumn = true;
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if (firstRow) {
      for (int j = 0; j < n; j++) {
        matrix[0][j] = 0;
      }
    }
    if (firstColumn) {
      for (int i = 0; i < m; i++) {
        matrix[i][0] = 0;
      }
    }
    return matrix;
  }
}

class set_matrix_zero84 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of m elements");
    int m = sc.nextInt();
    System.out.println("Enter the Size of n elements");
    int n = sc.nextInt();
    System.out.println("Enter elements in a matrix");
    int[][] matrix = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    sol.matrixZero(matrix, m, n);
    System.out.println("Matrix zero result is:");
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
    sc.close();

  }
}

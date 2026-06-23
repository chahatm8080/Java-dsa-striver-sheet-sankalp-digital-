//allocation of book is also similar and split arrays - largest
// import java.util.Arrays;
// import java.util.Scanner;

// class painter {
//     public int countStudent(int[] arr, int pages) {
//         int student = 1;
//         long pagesStudent = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (pagesStudent + arr[i] <= pages) {
//                 pagesStudent += arr[i];
//             } else {
//                 student += 1;
//                 pagesStudent = arr[i];
//             }
//         }
//         return student;
//     }

//     public int paintersPartition(int[] arr, int m) {
//         int n = arr.length;
//         if (m > n)
//             return -1;
//         int low = Arrays.stream(arr).max().getAsInt();
//         int high = Arrays.stream(arr).sum();
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int students = countStudent(arr, mid);
//             if (students > m) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return low;

//     }
// }

// class paintersPartition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = 4;
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++)
//             arr[i] = sc.nextInt();

//         painter obj = new painter();
//         sc.close();
//         System.out.println(obj.paintersPartition(arr, k));
//     }
// }

import java.util.*;

class PainterPartition {

    public int countPainters(int[] boards, int time) {
        int painters = 1;
        int boardsPainter = 0;

        for (int board : boards) {
            if (boardsPainter + board <= time) {
                boardsPainter += board;
            } else {
                painters++;
                boardsPainter = board;
            }
        }

        return painters;
    }

    public int findLargestMinDistance(int[] boards, int k) {
        int low = Arrays.stream(boards).max().getAsInt();
        int high = Arrays.stream(boards).sum();
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);

            if (painters > k) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] boards = { 10, 20, 30, 40 };
        int k = 2;

        PainterPartition pp = new PainterPartition();
        int ans = pp.findLargestMinDistance(boards, k);
        System.out.println(ans);
    }
}
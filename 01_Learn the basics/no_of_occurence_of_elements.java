import java.util.Scanner;

public class no_of_occurence_of_elements {
  public static int countOccurence(int[] arr, int num) {
    int count = 0;
    int i = 0;
    while (i < arr.length) {
      if (arr[i] == num) {
        count++;
      }
      i++;
    }
    return count;
  }

  public static void main(String[] args) {
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter size of the arrays: ");
      int size = input.nextInt();
      System.out.println("Enter number to find occurence: ");
      int num = input.nextInt();
      int[] arr = new int[size];
      int i = 0;
      while (i < size) {
        System.out.print("Enter number of elements" + (i + 1) + ": ");
        arr[i] = input.nextInt();
        i++;
      }
      System.out.println("THE OCCURRENCE OF " + num + " is " + countOccurence(arr, num));
      input.close();
    }
  }
}

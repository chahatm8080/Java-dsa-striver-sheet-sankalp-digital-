import java.util.Scanner;

class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
    this.next = null;
  }
}

public class traversingLL {
  public static void traverseLinkedList(ListNode head) {

    ListNode temp = head;

    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }

    System.out.println();
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of nodes: ");
    int n = sc.nextInt();

    if (n == 0) {
      System.out.println("Linked List is Empty");
      return;
    }

    System.out.print("Enter value of node 1: ");
    ListNode head = new ListNode(sc.nextInt());

    ListNode tail = head;

    for (int i = 2; i <= n; i++) {

      System.out.print("Enter value of node " + i + ": ");
      ListNode newNode = new ListNode(sc.nextInt());

      tail.next = newNode;
      tail = newNode;
    }

    System.out.println("\nTraversed Linked List:");

    traverseLinkedList(head);

    sc.close();
  }
}
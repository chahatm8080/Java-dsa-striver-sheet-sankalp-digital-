import java.util.Scanner;

class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
    this.next = null;
  }
}

class insertBegLL {

  public static void traverse(ListNode head) {
    ListNode temp = head;

    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static ListNode insertAtBeginning(ListNode head, int value) {

    ListNode newNode = new ListNode(value);

    newNode.next = head;

    head = newNode;

    return head;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of nodes: ");
    int n = sc.nextInt();

    ListNode head = null;
    ListNode tail = null;

    for (int i = 1; i <= n; i++) {

      System.out.print("Enter value of node " + i + ": ");
      int value = sc.nextInt();

      ListNode newNode = new ListNode(value);

      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }

    System.out.println("Original Linked List:");
    traverse(head);

    System.out.print("Enter value to insert at beginning: ");
    int x = sc.nextInt();

    head = insertAtBeginning(head, x);

    System.out.println("Linked List After Insertion:");
    traverse(head);

    sc.close();
  }
}
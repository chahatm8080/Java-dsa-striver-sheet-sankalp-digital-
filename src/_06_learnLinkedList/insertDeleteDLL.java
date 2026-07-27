import java.util.Scanner;

class Node {
  int val;
  Node prev;
  Node next;

  Node(int val) {
    this.val = val;
  }
}

class insertDeleteDLL {

  public static Node insertAtBeginning(Node head, int value) {

    Node newNode = new Node(value);

    if (head == null) {
      return newNode;
    }

    newNode.next = head;
    head.prev = newNode;

    return newNode;
  }

  public static Node insertAtEnd(Node head, int value) {

    Node newNode = new Node(value);

    if (head == null) {
      return newNode;
    }

    Node temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = newNode;
    newNode.prev = temp;

    return head;
  }

  public static Node insertAtPosition(Node head, int value, int position) {

    if (position == 1) {
      return insertAtBeginning(head, value);
    }

    Node temp = head;

    for (int i = 1; i < position - 1 && temp != null; i++) {
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println("Invalid Position");
      return head;
    }

    Node newNode = new Node(value);

    newNode.next = temp.next;
    newNode.prev = temp;

    if (temp.next != null) {
      temp.next.prev = newNode;
    }

    temp.next = newNode;

    return head;
  }

  public static void traverse(Node head) {

    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }

    System.out.println();
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of nodes: ");
    int n = sc.nextInt();

    Node head = null;
    Node tail = null;

    for (int i = 1; i <= n; i++) {

      System.out.print("Enter value of node " + i + ": ");
      int value = sc.nextInt();

      Node newNode = new Node(value);

      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
      }
    }

    System.out.println("\nOriginal List:");
    traverse(head);

    System.out.print("\nEnter value to insert at beginning: ");
    int begin = sc.nextInt();

    head = insertAtBeginning(head, begin);

    traverse(head);

    System.out.print("\nEnter value to insert at end: ");
    int end = sc.nextInt();

    head = insertAtEnd(head, end);

    traverse(head);

    System.out.print("\nEnter position: ");
    int pos = sc.nextInt();

    System.out.print("Enter value: ");
    int value = sc.nextInt();

    head = insertAtPosition(head, value, pos);

    traverse(head);

    sc.close();
  }
}
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

  public static Node insertAtBeginning(Node node, int value) {

    while (node.prev != null) {
      node = node.prev;
    }

    Node temp = new Node(value);

    temp.next = node;
    node.prev = temp;

    return temp;
  }

  public static Node insertAtEnd(Node node, int value) {

    while (node.next != null) {
      node = node.next;
    }

    Node temp = new Node(value);

    temp.prev = node;
    node.next = temp;

    while (temp.prev != null) {
      temp = temp.prev;
    }

    return temp;
  }

  public static Node insertAtPosition(Node head, int value, int position) {

    Node newNode = new Node(value);

    if (position == 1) {
      newNode.next = head;

      if (head != null) {
        head.prev = newNode;
      }

      return newNode;
    }

    Node temp = head;

    for (int i = 1; i < position - 1 && temp != null; i++) {
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println("Invalid Position");
      return head;
    }

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

    System.out.println("Original Doubly Linked List:");
    traverse(head);

    System.out.print("Enter value to insert at beginning: ");
    int begin = sc.nextInt();

    head = insertAtBeginning(head, begin);

    System.out.println("After Inserting at Beginning:");
    traverse(head);

    System.out.print("Enter value to insert at end: ");
    int end = sc.nextInt();

    head = insertAtEnd(head, end);

    System.out.println("After Inserting at End:");
    traverse(head);

    System.out.print("Enter position to insert: ");
    int pos = sc.nextInt();

    System.out.print("Enter value to insert: ");
    int value = sc.nextInt();

    head = insertAtPosition(head, value, pos);

    System.out.println("After Inserting at Position:");
    traverse(head);

    sc.close();
  }
}
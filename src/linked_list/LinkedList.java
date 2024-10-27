package linked_list;

import register_code.RegisterCode;

public class LinkedList {
  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public Node getHead() {
    return this.head;
  }

  public void insert(RegisterCode registerCode) {
    Node newNode = new Node(registerCode);

    if (isEmpty()) {
      this.head = newNode;
      return;
    }

    Node current = this.head;
    while(current.getNext() != null) {
      current = current.getNext();
    }

    current.setNext(newNode);
  }

  public RegisterCode search(RegisterCode registerCode) {
    Node current = this.head;

    while(current != null) {
      if (current.getRegisterCode().getCode() == registerCode.getCode()) {
        return current.getRegisterCode();
      }
      current = current.getNext();
    }

    return null;
  }
}

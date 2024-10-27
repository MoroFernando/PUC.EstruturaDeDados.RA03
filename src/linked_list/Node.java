package linked_list;

import register_code.RegisterCode;

public class Node {
  RegisterCode registerCode;
  Node next;

  public Node(RegisterCode registerCode) {
    this.registerCode = registerCode;
    this.next = null;
  }

  public RegisterCode getRegisterCode() {
    return this.registerCode;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}

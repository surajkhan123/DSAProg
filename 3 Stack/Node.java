package 3 Stack;

public class Node {
  public static void main(String[] args) {
    Object ele;
    Node next;

    Node(Object ele){
      this.ele  = ele;
    }
    public Node(Object ele,Node next){
      this.ele = ele;
      this.next = next;
    }
  }
}

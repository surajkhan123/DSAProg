// package LinkedList.DoublyLinkedList;

public class DoubleLinkedList {
  Node head;
  int count = 0;
  Node tail;

  public void add(Object ele){
    Node n = new Node(ele);
    if(head == null){
      head = n; tail = n;
      count++;
      tail = head;
      return;
    }
    Node curr = head;
    while(curr.next !=null)
      curr = curr.next;
    curr.next = n;
    n.prev = curr;
    tail=n;
    count++;
  }

  public int size(){
    return count;
  }

  public boolean isEmpty(){
    return count ==0;
  }

  public void display(){
    Node curr = head;
    while(curr!= null){
      System.out.println(curr.ele);
      curr = curr.next;
    }
  }

  public void revDisplay(){
    Node curr  = tail;
    while(curr!= null){
      System.out.println(curr.ele);
      curr  = curr.prev;
    }
  }



  public void addLast(Object ele){
    Node n = new Node(ele);
    tail.next = n;
    n.prev = tail;
    tail = n;
    count++;

  }

  public void addFirst(Object ele){
    Node n = new Node(ele);
    n.next = head;
    head.next = n;
    head = n;
    count++;
  }

  public void add(Object ele, int index){
    if(index <0 || index >size()) throw new IndexOutOfBoundsException();
    if(index ==0){
      addFirst(ele);
      return;
    }
  }

  public Object get(int index){
    if(index <0 || index >= size()) throw new IndexOutOfBoundsException();
    Node curr = head;
    for(int i=1;i<= index;i++){
      curr = curr.next;
    }
    return curr.ele;
  }

  
}

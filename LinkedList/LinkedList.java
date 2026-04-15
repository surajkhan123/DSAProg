package LinkedList;

public class LinkedList {

  Node head;
  int count = 0; 

  @Override   
  public String toString(){
   if (head == null) 
    return "null";
    String s= "Head ->";
    Node current = head;

    while (current != null) {
      s += current.ele;
      if(current.next !=null) s += " -> ";
    current = current.next;  
    
   }
    return s+" -> null";
  }

  public void add(Object ele){
    Node n = new Node(ele);

    if(head ==null){
      head = n;
      count++;
      return;
    }

    Node current = head;
    //moving current to next 
    while(current.next != null)
      current = current.next;
    current.next = n;
    count++;
  }

  public void add(Object ele, int index){
    if(index <0 || index > size())
      throw new IndexOutOfBoundsException();
    if(index==0){
      addFirst(ele);
      return;
    }
    Node n = new Node(ele);
    Node current = head;
    for(int i=1;i< index;i++)
      current =current.next;
    n.next = current.next;
    current.next = n;
    count++;
  }

  public void removeFirst(){
    head = head.next;
    count--;
  }

  public void remove(int index){
    if(index ==0){
      removeFirst();
      return;
    }
    Node current = head;
    for(int i=1;i<index ;i++)
    current = current.next;
    current.next = current.next.next;
    count--;
  }

  public void reverse(){
    Node next = null;
    Node current = head;
    Node prev = null;

    while(current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;

  }

  public void contains(){
    
  }

  public int size(){
  return count;
  }

  public boolean isEmpty(){
    return count == 0;
  }

  public void display(){
    Node current = head;
    while(current != null){
      System.out.println(current.ele);
      current = current.next;
    }
  }

  public void addFirst(Object ele){
    Node n = new Node(ele);
    n.next = head;
    head = n;
    count++;

  }

  public Object get(int index){
    if(index < 0 || index >= size())
      throw new IndexOutOfBoundsException();
    Node current =  head;
    for(int i=1;i<= index;i++)
      current = current.next;
    return current.ele;

    }
  }


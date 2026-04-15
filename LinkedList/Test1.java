package LinkedList;

public class Test1 {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();

    System.out.println("Is empty: "+l.isEmpty());

    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(50);


    System.out.println("size of LinkedList is:" +l.size());

    // System.out.println(l.get(0));

    // System.out.println("is empty:"+l.isEmpty());

    // l.add(25,2);

    l.reverse();


    l.display();
  }
}

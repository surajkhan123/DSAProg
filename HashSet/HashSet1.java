package HashSet;

public class HashSet1 {
  // also include contains() method & remove() method

  Node[] a = new Node[10];
  int count = 0;

  public boolean add(Object ele){
    Node n = new Node(ele);
    int index = Math.abs(ele.hashCode()% a.length); //hashing
    if(a[index]== null){
      a[index] = n;
      count++;
      return true;
    }
    Node temp = null;
    Node curr = a[index];
    while(curr!= null){
      if(curr.ele.equals(ele))
        return false;
      temp = curr;
      curr = curr.next;
    }
    temp.next = n;
    count++;
    return true;

  }

  public int size(){
    return count;
  }
  public boolean isEmpty(){
    return count==0;
  }
  public void display(){
    for(int i=0;i< a.length;i++){
      Node curr = a[i];
      while(curr !=null){
        System.out.println(curr.ele);
        curr = curr.next;
      }
    }
  }

  public boolean contains(Object ele){
    int index = Math.abs(ele.hashCode() %a.length);
    Node curr = a[index];

    while(curr!= null){
      if(curr.ele.equals(ele))
        return true;
      curr = curr.next;
    }
    return false;

  } 

  public boolean remove(Object ele){
    int index = Math.abs(ele.hashCode() % a.length);

    Node curr = a[index];
    Node prev = null;

    while(curr != null){
      if(curr.ele.equals(ele)){
        //case 1: deleting first node
        if(prev == null){
          a[index] = curr.next;
        }
        // case 2: deleting middle or last node
        else {
          prev.next = curr.next;
        }
        count--;
        return true;
      }
      prev = curr;

      curr = curr.next;
    }
    return false;
  }
}

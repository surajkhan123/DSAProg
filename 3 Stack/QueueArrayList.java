import java.util.*;

public class QueueArrayList {

  int capacity = 3;
  ArrayList<Integer> queue = new ArrayList<>();

  void enqueue(int x){
    if(queue.size() < capacity){
      queue.add(x);
      System.out.println("Successfully added: " + x);
    } else {
      System.out.println("Exception! Queue Overflow!");
    }
  }

  int dequeue(){
    if(queue.size() == 0){
      System.out.println("Exception! Queue Underflow");
      return -1;
    }

    int val = queue.get(0);
    queue.remove(0);
    return val;
  }

  int peek(){
    if(queue.size() == 0){
      System.out.println("Exception! Queue Underflow");
      return -1;
    }

    return queue.get(0);
  }

  public static void main(String[] args) {

    System.out.println("Queue using ArrayList");

    QueueArrayList q = new QueueArrayList();

    System.out.println("Peek: " + q.peek());

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println("Deleted: " + q.dequeue());

    System.out.println("Peek: " + q.peek());
  }
}
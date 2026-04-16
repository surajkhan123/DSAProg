public class QueueArray {

  int capacity = 3;
  int[] queue = new int[capacity];
  int front = 0;
  int rear = -1;

  void enqueue(int x){
    if(rear == capacity - 1){
      System.out.println("Exception! Queue Overflow!");
    } else {
      rear++;
      queue[rear] = x;
      System.out.println("Successfully added: " + x);
    }
  }

  int dequeue(){
    if(front > rear){
      System.out.println("Exception! Queue Underflow");
      return -1;
    }

    int val = queue[front];
    front++;
    return val;
  }

  int peek(){
    if(front > rear){
      System.out.println("Exception! Queue Underflow");
      return -1;
    }

    return queue[front];
  }

  public static void main(String[] args) {

    System.out.println("Queue using Array");

    QueueArray q = new QueueArray();

    System.out.println("Peek: " + q.peek());

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println("Deleted: " + q.dequeue());

    System.out.println("Peek: " + q.peek());
  }
}
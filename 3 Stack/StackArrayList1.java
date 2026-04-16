import java.util.*;

public class StackArrayList1 {

  int capacity = 3;
  ArrayList<Integer> stack = new ArrayList<>();
  int top = -1;

  void push(int x){
    if(top < capacity-1){
      stack.add(x);
      top++;
      System.out.println("Successfully added: " + x);
    } else {
      System.out.println("Exception! Stack Overflow!");
    }
  }

  int pop(){
    if(top < 0){
      System.out.println("Exception! Stack Underflow");
      return -1;
    }

    int val = stack.get(top);
    stack.remove(top);
    top--;
    return val;
  }

  int peek(){
    if(top < 0){
      System.out.println("Exception! Stack Underflow");
      return -1;
    }

    return stack.get(top);
  }

  public static void main(String[] args) {
    System.out.println("Executing Stack operation");

    StackArrayList2 s = new StackArrayList2();

    System.out.println("Peek Returned: " + s.peek());

    s.push(10);
    s.push(20);
    s.push(30);

    System.out.println("Pop Deleted: " + s.pop());

    s.push(0);

    System.out.println("Peek Returned: " + s.peek());
  }
}
package 3 Stack;

public class StackArrayList1 {
  private Object[] arr;
  private int count;
  public stack{


  public ArrayList(){
    arr = new Object[5];  //later n+(n/2)+1  //initially 10
    count = 0;
  }

  //push
  public void push(Object data){
    if(count==arr.length){
      System.out.println("Stack Overflow");
      return;
    }
    arr[count] = data;
    count++;
  }
  //pop
  public Object pop(){
    if(count==0){
      System.out.println("Stack Underflow");
      return null;
    }
    count--;
    return arr[count];
  }

  //peek
  public Object peek(){
    if(count==0){
      System.out.println("Stack is empty");
      result null;
    }
    return arr[count-1];
  }


  }
  
}

// package ArrayList;

public class ArrayList {
  private Object[] arr;
  private int p;

  public ArrayList(){
    arr = new Object[5];  //later n+(n/2)+1  //initially 10
    p = 0;
  }

  private void increase(){
    // Object[] temp = new Object[arr.length+3];
    Object [] temp = new Object[arr.length+(arr.length/2)];
    for(int i=0;i< arr.length;i++){
      temp[i] = arr[i];
    }
    arr = temp;
  }

  public void add(Object e){
    if(p>= arr.length) increase();
    arr[p++]=e;
  }
  

  public int size(){
    return p;
  }
  public Object get (int index){
    if(index <= -1 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    return arr[index];
  }

  public void add(int index,Object e){
    if(index<=-1 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    if(p>= arr.length) increase();
    for(int i = size()-1; i>= index;i--){
      arr[i+1] = arr[i];
    }
    arr[index] = e;
    p++;
  }

  public void remove(int index){
    if(index<=-1 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    for(int i =index+1; i< size(); i++){
      arr[i-1] = arr[i];
    }
    p--;
    arr[p]= null;
  }

  public void display(){
    for(int i =0;i< size(); i++){
      System.out.println(arr[i]+" ");
    }
  }

  @Override
  public String toString(){
    if(p==0)
      return "[]"; // empty list
    String s ="[";
    for(int i = 0; i<p; i++){
      s += arr[i];
      if(i<p -1)
        s +=", "; //add comma except for last element
    }
    return s + "]";
  }


}

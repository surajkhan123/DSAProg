package String;

public class MissingMulEle1 {
  public static void main(String[] args) {
    int [] arr ={1,3,5};
    int n = 5;

    boolean[] elements = new boolean[n+1];

    for(int i=0;i < arr.length;i++)
      elements[arr[i]] = true;

    System.out.println("Missing Elements");
    for(int i=1;i<=n; i++)
      if(elements[i]== false) System.out.println(i+"");



  }
}

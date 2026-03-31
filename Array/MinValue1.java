package Array;

public class MinValue1 {
  public static void main(String[] args) {
    int a[] = {9,3,2,5};
    int min = a[0];
    for(int i=0;i< a.length;i++){
      if(a[i] < min) min = a[i];
    } System.out.println(min);
    
  }
}

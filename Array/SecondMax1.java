package Array;

public class SecondMax1 {
  public static void main(String[] args) {
    int a[] = {2,14,5,6,8,9,10,16};
    int second = a[0];

    for(int i=0;i< a.length;i++){

      for(int j=0;j< a.length-1; j++){
        if(a[i]< a[j]) second = a[j];

      } 
    }System.out.println(second);
  }
}

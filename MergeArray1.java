import java.util.Arrays;

public class MergeArray1 {
  public static void main(String[] args) {
    int [] a ={1,2,3,4};
    int [] b ={3,4,5,6};

    int [] c = new int[a.length + b.length];
    for(int i=0; i< a.length; i++){
      c[i] = a[i];
    }
    for(int i=0;i< b.length;i++){
      c[i+ a.length] = b[i];
    } System.out.println(Arrays.toString(c));
  }
}

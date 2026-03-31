package String.Searching;

public class BinarySearch1 {
  public static void main(String[] args) {
    int [] a ={10,20,30,40,50};
    System.out.println(find(a, 30));
    
  }
  public static int find(int[] a,int key){
    int st =0; int end =a.length-1;
    while (st<=end){
    int mid =(st+end)/2;

    if (key == a[mid]) return mid;
 
    else if(key < a[mid]) return mid -1;
    else st = mid +1;
  } return -1;
}
}

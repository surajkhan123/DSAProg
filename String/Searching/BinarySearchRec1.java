package String.Searching;

public class BinarySearchRec1 {
  public static void main(String[] args) {
    int a[] ={10,20,34,36,75};
    System.out.println(find(a, 36, 0, a.length-1));
    
  }

  public static int find(int[] a,int key,int st,int end){
    if(st>end ) return -1;
    int mid = (st+end)/2;
    if(key == a[mid]) return mid;
    if (key< a[mid]) return find(a,key,st, mid-1);
    else return find(a,key,mid+1,end);
  }
  
}


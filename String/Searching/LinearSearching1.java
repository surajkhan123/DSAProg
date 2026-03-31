package String.Searching;

public class LinearSearching1 {

  public static void main(String[] args) {
    int a[] ={10,20,30,40,50};
    System.out.println(find(a, 40));
  }
  public static int find(int[] a,int key){
    for(int i=0;i< a.length;i++)
      if(a[i]==key) return i;
    return -1;

  } 
}
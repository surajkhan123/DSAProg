package String;

public class MissingEle3 {
  public static void main(String[] args) {
    int[] arr ={1,2,4,5};
    int n= 5;

    System.out.println("Missing Number "+findMissing(arr, n));
  
  }
  public static int findMissing(int[] arr, int n){
    int xor1 =0, xor2 =0;

    //XOR 1 to n
    for(int i=1;i<=n;i++) xor1 ^=i;

    //XOR array elements
    for(int i=0; i< arr.length;i++) xor2 ^=arr[i];

    return xor1 ^ xor2;
  }
  
}

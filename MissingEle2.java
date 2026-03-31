public class MissingEle2 {
  public static void main(String[] args) {
    int [] arr = {1,2,4,5};
    int n =5;

    System.out.println("Missing Number: "+findMissing(arr, n));
    
  }
  public static int findMissing(int[] arr, int n){
    int total = n* (n+1) /2;
    int sum =0;

    for(int i=0; i< arr.length; i++){
      sum = sum + arr[i];
    } return total - sum;
  }
}

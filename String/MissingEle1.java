package String;

public class MissingEle1 {
  public static int MissingNum(int[] arr){
    // int[] arr ={1,2,4,5,6};
    int n = arr.length+1;
    int ActualSum = ((n)*(n+1))/2;
    int Sum=0;

    for(int i=0; i<arr.length;i++)
      Sum = Sum+ arr[i];
    return ActualSum-Sum;
  }
  public static void main(String[] args) {
    int [] arr= {1,2,4,5,6};
    System.out.println(MissingNum(arr));
  }
}

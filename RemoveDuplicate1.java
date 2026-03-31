// public class RemoveDuplicate1 {

//   public static void main(String[] args) {
    
//     int[] arr ={1,2,2,3,3,3,4,4,4,5};
//     int len = arr.length;
//     int[] temp = new int[len];

//     int j = 0;

//     for(int i =0; i< len - 1; i++){
//       if(arr[i] != arr[i+1]){
//         temp[j] = arr[i];
//         j++;
//       }
//     }
//     // Add last element
//     temp[j] = arr[len-1];
//     j++;
//     //Print result
//     for(int i=0; i< j;i++){
//       System.out.print(temp[i]+" ");


//     }
//   }
// }


public class RemoveDuplicate1 {

  public static void main(String[] args) {
    int[] arr = {1,2,2,2,3,3,3,4,4,4,5,5,6};
    int[] temp = new int[arr.length];
    int j =0;

    for(int i=0; i< arr.length-1; i++){
      if(arr[i] != arr[i+1]){
        temp[j]= arr[i];
      j++;
    } 
  }

    temp[j] = arr[arr.length - 1];
      j++;

      for(int i=0; i< j;i++){
      System.out.print(temp[i]+" ");
      }

  }
}
package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort1 {
  public static void main(String[] args) {
    int[] a ={5,5,6,1,2,0,4,3,8,4};
    sort(a);
    System.out.println(Arrays.toString(a));
    
  }
  public static void sort(int[] a){
    for(int i=1;i < a.length; i++){
      int j = i-1;
      int key = a[i];
      while(j >= 0 && a[j] > key){
        a[j+1] = a[j];
        j--;
      } a[j+1] = key;
    }
  }
}

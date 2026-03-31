package SortingAlgorithm;

import java.util.Arrays;

public class QuickSort1 {
  public static void main(String[] args) {
    int [] a ={5,4,7,9,8,8,9};
    sort(a, 0, a.length-1);
    System.out.println(Arrays.toString(a));

  }
  public static void sort(int [] a, int st, int end){
    if(st>= end)  return;
    int i =st; int j = end;
    int pivot = (st+end)/2;
    if(i < j){
      while(a[i] < a[pivot])
        i++;
      while(a[j] > a[pivot])
        j--;
    }
    if (i <= j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
      
    }
    sort(a, st, j);
    sort(a, i, end);
  }
}

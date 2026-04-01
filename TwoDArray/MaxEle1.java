package TwoDArray;

public class MaxEle1 {

  public static void main(String[] args) {
    int[] [] a ={{1,2,3}, {4,5,6},{9,8,7}};
    int max = Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
      for(int j=0;j< a[i].length;j++){
        if(a[i][j] > max)
          max = a[i][j];
      }
    } System.out.println(max);
  }
}


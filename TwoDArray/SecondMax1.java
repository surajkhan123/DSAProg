public class SecondMax1 {
  public static void main(String[] args) {
    int [][]a ={{1,2,3},
                {4,5,6},
                {7,8,9}};
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    
    for(int i=0;i< a.length; i++){
      for(int j=0;j<a[i].length;j++){
        if(a[i][j] > max){
          secondMax = max;
        max = a[i][j];
        }else if(a[i][j] > secondMax && a[i][j]!= max)
          secondMax = a[i][j];
      }
    } System.out.println("2nd Max is ele: "+secondMax);
  }
}

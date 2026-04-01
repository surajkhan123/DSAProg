import java.util.stream.Gatherer.Integrator;

public class SecondMin1 {
  public static void main(String[] args) {
    int [][] a = {{1,2,3},
                  {4,5,6},
                  {7,8,9}};
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for(int i=0;i<a.length;i++){
      for(int j=0;j< a[i].length;j++){
        if(a[i][j] < min){
          secondMin = min; // old min becomes 2nd min
          min = a[i][j]; // New min found 
        // secondMin = min;
        } else if(a[i][j] < secondMin && a[i][j]!= min)
          secondMin = a[i][j];  // found something between min and old secondMin
      } 
    }System.out.println("2nd Minimum is ele : "+secondMin);
  }
  
}

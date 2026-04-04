public class MatrixMulti2 {
  public static void main(String[] args) {
    
    int[][] a ={{1,2,3},
               {3,4,5},
               {3,2,6}};
    int[][] b ={{2,1,3},
               {3,5,2},
               {2,3,4}};

    int[][] c = new int[a.length][a.length];

    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        for(int k=0;k< a[i].length;k++){
          c[i][j] +=a[i][k]*b[k][j];
        }
      }
    } for(int []n:c)
    {
      for(int m:n) System.out.print(m+" ");
      System.out.println();
    }

  }
}

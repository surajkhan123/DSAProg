
// input: {{1,3,7},{8,4,5},{6,2,9}};
// key =2;
// output={1,2};
public class ArrayDemo { //Linear Search in a 2D Array (or Matrix)
  public static void main(String[] args) {
    int[][] a ={{1,3,7},
                {8,4,5},
                {6,2,9}};
    int key =2;

    for(int i=0;i<a.length;i++){
      for(int j=0;j< a[i].length;j++){
        if(a[i][j] == key) System.out.println("["+i+","+j+"]");
      }
    }
  }
}

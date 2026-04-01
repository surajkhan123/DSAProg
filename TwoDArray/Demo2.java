
package TwoDArray;

public class Demo2 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {3, 4, 2}};
        int[][] b = {{1, 1, 2}, {2, 3, 8}};
        
        // Initialize c with the same rows and columns
        int[][] c = new int[a.length][a[0].length];

        System.out.print("[");

        // Loop through rows
        for (int i = 0; i < a.length; i++) {
            // Loop through columns
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                
                System.out.print(c[i][j] + " ");
                
            }
            if(i<c.length-1)System.out.println();
            else System.out.print("]");
            // System.out.println(); // Move to next line for the next row
            
        }
    }
}


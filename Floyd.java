package floyd;

public class Floyd {

    public static void main(String[] args) {
        // The matrix is a 4x4 matrix
        int size = 4;

        // Infinity variable equals 10000. 
        // This variable is used in the distance matrix to show 
        // that there's no path from node i to j.
        final int INF = 10000;

        // declare and initialize matrix
        int[][] matrix = {
            {0, INF, 3, INF},
            {2, 0, INF, INF},
            {INF, 7, 0, 1},
            {6, INF, INF, 0}
        };
        // Matrix before running Floyd's algorithm:
        System.out.println("Weight Matrix:\n");
        PrintMatrix(matrix, INF);
       
        System.out.println("\nNow computing the distance matrix...\n\n\n");
        // Call the Floyd method, passing the current matrix and size as arguments
        Floyd(matrix, size);
        
        // Matrix after running Floyd's algorithm:
        System.out.println("Distance Matrix: \n");
        PrintMatrix(matrix, INF);
        
    } // main

    public static void PrintMatrix(int[][] matrix, int INF) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == INF) {
                    System.out.print("∞\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println("");

        }
        System.out.println("\n\n");

    }

    public static void Floyd(int[][] matrix, int V) {
        /*
        
      - Description:
        This algorithm finds the length of the 
        shortest path from each vertex to every other vertex
        
      - Parameters: 
        matrix - some weight matrix
        V - number of vertices in each row/column 
        (This method assumes the inputted matrix is a square matrix)        
     
      - Output: 
        This method returns no output. It modifies the inputted weight matrix 
        and turns it into a distance matrix.
         */

        // iterate for the kth time: we iterate over the matrix k times 
        for (int k = 0; k < V; k++) {
            // iterate over ith row
            for (int i = 0; i < V; i++) {
                // iterate over jth column
                for (int j = 0; j < V; j++) {
                    /* 
                    matrix[i][j] is the distance between vertices i and j
                    matrix[i][k] is the distance between vertices i and k
                    matrix[k][j] is the distance between vertices k and j
                    
                    check to see if there is a shorter path form i to j 
                    by comparing the current path from i to j to the sum of the paths
                    between ik and kj
                     */

                    if (matrix[i][j] > matrix[i][k] + matrix[k][j]) {
                        // if there exists a shorter path from i to j, then
                        // replace the current path from i to j with the shorter one
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }

    }
}

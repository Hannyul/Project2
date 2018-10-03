/*
NAMES 
NAMES 
NAMES 
NAMES 
NAMES !!!!!!!!!!!!!!!!!
*/

package warshall;

public class Warshall {

    public static void main(String[] args) {

        // the size of the matrix 
        int size = 4;

        // Declare and initialize adjacency matrix
        int[][] matrix = {
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 1, 0, 1},
            {1, 0, 0, 0}
        };

        // Matrix before running Warshall's algorithm:
        System.out.println("Adjacency Matrix:");
        PrintMatrix(matrix);

        System.out.println("\nNow computing its transitive closure...\n\n\n");

        // Call the Warshall method, passing the current matrix and size as arguments
        Warshall(matrix, size);

        // Matrix after running Warshall's algorithm:
        System.out.println("Transitive closure: ");
        PrintMatrix(matrix);

    } // main

    public static void PrintMatrix(int[][] matrix) {
        /*
      - Description:
        This method prints a matrix onto the console
        
      - Parameters:
        matrix - some adjacency matrix representing a digraph

      - Output:
         This method returns no output. It simply prints text onto the console
         */
        // iterate over rows
        for (int i = 0; i < matrix.length; i++) {
            // iterate over columns
            for (int j = 0; j < matrix[i].length; j++) {
                // if the value at matrix[i][j] is zero, 
                // then there is no path 
                if (matrix[i][j] == 0) {
                    // print zero
                    System.out.print("0\t");
                } // otherwise, there is a path    
                else {
                    // print one indicating vertex j is reachable from vertex i
                    System.out.print("1\t");
                }
            }
            // print a line to seperate rows
            System.out.println("");
        }
        System.out.println("\n\n");

    }

    public static void Warshall(int[][] matrix, int V) {
        /*
      - Description:
        This method computes the transitive closure of an adjacency matrix representing a digraph, 
        i.e. it indicates which vertices are reachable from which vertices. 
        
      - Parameters:
        matrix - an adjacency matrix 
        V - number of rows/columns.

      - Output:
        This method returns no output. It simply modifies the inputted adjacency matrix
        and turns it into its transitive closure
        
         */

        // we use intermediate nodes (not higher than k-1) to establish indirect paths
        for (int k = 0; k < V; k++) {
            // iterate over ith row
            for (int i = 0; i < V; i++) {
                // iterate over jth column
                for (int j = 0; j < V; j++) {

                    /* 
                    matrix[i][k] is the path between vertices i and k
                    matrix[k][j] is the path between vertices k and j
                    matrix[i][j] is the path between vertices i and j

                    the vertices at (i,k) and  (k,j) intersect with (i,j) at k
                    if (i,j) is zero, and vertices (i,k) and (k,j) are both 1, 
                    then there is a path from i to j. 
                    In other words, a directed path exists, so change (i,j) to 1

                     */
                    if (matrix[i][k] == 1 && matrix[k][j] == 1 && matrix[i][j] != 1) {
                        matrix[i][j] = 1;
                    }
                }
            }
        }

    }
}

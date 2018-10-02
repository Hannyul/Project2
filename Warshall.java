package warshall;

public class Warshall {

    public static void main(String[] args) {

        // the size of the matrix 
        int size = 4;
        // Initialize the matrix
        int[][] PathMatrix = {
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 1, 0, 1},
            {1, 0, 0, 0}
        };

        // PrintMatrix before warshall;
        System.out.println("Before:");
        PrintMatrix(PathMatrix);

        Warshall(PathMatrix, size);
        // PrintMatrix after warshall;
        System.out.println("After: ");
        PrintMatrix(PathMatrix);

    } // main

//    
//    public static void InitializeWeightMatrix(int[][] x, int infinity) {
//
//        x[0][0] = 0;
//        x[0][1] = infinity;
//        x[0][2] = 3;
//        x[0][3] = infinity;
//        x[1][0] = 2;
//        x[1][1] = 0;
//        x[1][2] = infinity;
//        x[1][3] = infinity;
//        x[2][0] = infinity;
//        x[2][1] = 7;
//        x[2][2] = 0;
//        x[2][3] = 1;
//        x[3][0] = 6;
//        x[3][1] = infinity;
//        x[3][2] = infinity;
//        x[3][3] = 0;
//
//    }
    public static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // if there is no path 
                if (matrix[i][j] == 0) {
                    System.out.print("0\t");
                    // else there is path    
                } else {
                    System.out.print("1\t");
                }
            }
            System.out.println("");

        }
        System.out.println("\n\n");

    }

    public static void Warshall(int[][] matrix, int V) {

        for (int k = 0; k < V; k++) {

            for (int i = 0; i < V; i++) {

                for (int j = 0; j < V; j++) {
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (matrix[i][k] == 1 && matrix[k][j] == 1) {
                        matrix[i][j] = 1;
                    }
                }
            }
        }

    }
}

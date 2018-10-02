
package floyd;

public class Floyd {

   
    public static void main(String[] args) {

       
        int size = 4;
        final int INF = 10000;
        

        int[][] DistanceMatrix = {
            
            {0,INF,3,INF},
            {2,0,INF,INF},
            {INF,7,0,1},
            {6,INF,INF,0}
            
        };
       
        System.out.println("Before:");
                PrintMatrix(DistanceMatrix,INF);

        Floyd(DistanceMatrix, size);
        System.out.println("After: ");
        PrintMatrix(DistanceMatrix,INF);
        // PrintMatrix(DistanceMatrix);
        



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


        for (int k = 0; k < V; k++) { 
            
            for (int i = 0; i < V; i++) {
              
                for (int j = 0; j < V; j++) {  
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (matrix[i][j] > matrix[i][k] + matrix[k][j] ) { 
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }


    }
}



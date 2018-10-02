
package floyd;

public class Floyd {

   
    public static void main(String[] args) {

    //
        int infinity = 9999, vertices = 4;
        //
        int[][] DistanceMatrix = new int[vertices][vertices];
        int[][] WeightMatrix = new int[vertices][vertices];

        InitializeDistanceMatrix(DistanceMatrix);
        //PrintMatrix(DistanceMatrix);


    }

    public static void InitializeDistanceMatrix(int[][] x) {

        x[0][0] = 0;
        x[0][1] = 10;
        x[0][2] = 3;
        x[0][3] = 4;
        x[1][0] = 2;
        x[1][1] = 0;
        x[1][2] = 5;
        x[1][3] = 6;
        x[2][0] = 7;
        x[2][1] = 7;
        x[2][2] = 0;
        x[2][3] = 1;
        x[3][0] = 6;
        x[3][1] = 16;
        x[3][2] = 9;
        x[3][3] = 0;

    }



    public static void PrintMatrix(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");

            }
            System.out.println("");

        }
                System.out.println("\n\n");

    }

    
}

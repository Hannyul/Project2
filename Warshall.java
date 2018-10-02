package warshall;


public class Warshall {

    public static void main(String[] args) {
        //
        int infinity = 9999, vertices = 4;
        //
        int[][] WeightMatrix = new int[vertices][vertices];
        InitializeWeightMatrix(WeightMatrix, infinity);
       // PrintWeightMatrix(WeightMatrix, infinity);

    }

    public static void InitializeWeightMatrix(int[][] x, int infinity) {

        x[0][0] = 0;
        x[0][1] = infinity;
        x[0][2] = 3;
        x[0][3] = infinity;
        x[1][0] = 2;
        x[1][1] = 0;
        x[1][2] = infinity;
        x[1][3] = infinity;
        x[2][0] = infinity;
        x[2][1] = 7;
        x[2][2] = 0;
        x[2][3] = 1;
        x[3][0] = 6;
        x[3][1] = infinity;
        x[3][2] = infinity;
        x[3][3] = 0;

    }

    public static void PrintWeightMatrix(int[][] x, int infinity) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {

                if (x[i][j] == infinity) {
                    System.out.print("∞\t");
                } else {
                    System.out.print(x[i][j] + "\t");
                }
            }
            System.out.println("");

        }
        System.out.println("\n\n");
    }

}

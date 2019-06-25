package Test1;

public class Matrix {
    public static int[][] matrixAddition(int[][] a, int[][] b) {

        for(int i = 0; i<a.length; i++){
            for(int y = 0; y<a[i].length;y++){
                a[i][y] =a[i][y]+b[i][y];
            }
        }



        return a;
    }
}

import java.util.Arrays;

public class reshapeMatrix {
    static int[][] matrixReshape(int[][] mat, int r, int c) {

        if(r*c!=mat.length*mat[0].length){
            System.out.println(Arrays.deepToString(mat));

            return mat;

        }
        System.out.println("=====");
        int [][] arr = new int[r][c];
        int a=0,b=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=mat[a][b];
                b++;
                if(b==mat[0].length){
                    b=0;
                    a++;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        return arr;

    }

}



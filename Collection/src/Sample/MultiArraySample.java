package Sample;

public class MultiArraySample {

    public static void main(String[] args) {
        int[][] matrix = new int[3][4]; //3x4の2次元配列
        
        //2次元配列へのアクセスと代入
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * 3 + j + 1; //値の代入
             } 
        }
        
        
        //2次元配列の要素を表示
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}

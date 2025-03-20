import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},{4,5,6}, {7,8,9}
        };
        System.out.println((transpose(matrix)));
    }

    static int[][] transpose(int[][] m) {
        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }
}

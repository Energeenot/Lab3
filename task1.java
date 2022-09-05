package Lab3;

public class task1 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][4];
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 4; j++){
                matrix[i][j] = j*5;
            }
        }
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

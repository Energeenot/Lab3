package Lab3;


public class task4 {
    public static void main(String[] args) {
        int[][] matrix = {{9, 8, 7 , 4}, {6, 5, 4, 1}, {3, 2, 1, 4,}, {6, 5, 4, 7}};
        for (int i = 1; i < 4; i++){
            for (int j = 0; j < i; j++){
                matrix[i][j] = 0;
            }
        }
        System.out.println("Преобразованная марица");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

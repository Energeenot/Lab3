package Lab3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строчек");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int p = m / 2;
        int tmp;
        System.out.println("Введите элементы массива");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Преобразованная марица");
        for (int i = 0; i < p; i++){
            for (int j = 0; j < n; j++){
                tmp = matrix[i+p][j];
                matrix[i+p][j] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

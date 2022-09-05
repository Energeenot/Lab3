package Lab3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строчек");
        int m = scanner.nextInt();
        int sum = 0;
        System.out.println("Введите количество столбцов");
        int n = scanner.nextInt();
        System.out.println("Введите элементы массива");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int k = 1;
        while (k <= m) {
            for (int j = 0; j < n; j++) {
                sum += matrix[k][j];
                k += 2;
            }
            System.out.println(sum / n);
        }
    }
}

package Lab3;

import java.util.Scanner;

public class clwt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][4];
        int x = 0;
        int y = 0;
        int min = 1000000000;
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        System.out.println("Введите элементы матрицы");
        switch (letter){
            case "а":
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 4; j++){
                        matrix[i][j] = scanner.nextInt();
                        if (matrix[i][j] < min){
                            min = matrix[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
                System.out.println("наименьший элемент " + min + " номера его строки и столбца " + x + " " + y);
                break;
            case "б":
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 4; j++){
                        matrix[i][j] = scanner.nextInt();
                        if (matrix[i][j] < min){
                            min = matrix[i][j];
                            y = j;
                        }
                    }
                }
                for (int i = 0; i < 3; i++){
                    int temp = matrix[i][y];
                    matrix[i][y] = matrix[i][3];
                    matrix[i][3] = temp;
                }
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 4; j++){
                        System.out.print(matrix[i][j] + "  ");
                    }
                    System.out.println();
                }
                break;
            case "в":
                System.out.println("Ничего не понял");
                break;
            case "г":
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 4; j++){
                        matrix[i][j] = scanner.nextInt();
                        if (matrix[i][j] < min){
                            min = matrix[i][j];
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        matrix[0][j] = min;
                        System.out.print(matrix[i][j] + "  ");
                    }
                    System.out.println();
                }
        }
    }
}

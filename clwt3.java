package Lab3;

import java.util.Scanner;

public class clwt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int proiz = 1;
        int[][] matrix = new int[2][3];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = (int)(Math.random()*31);
            }
        }
        System.out.println("Исходная матрица");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case "а":
                for (int k = 0; k < 2; k++){
                    for (int g = 0; g < 3; g++){
                        sum += matrix[k][g];
                    }
                }
                if (sum % 2 == 0){
                    System.out.println("Сумма чётная");
                }
                break;
            case "б":
                for (int k = 0; k < 2; k++){
                    for (int g = 0; g < 3; g++){
                        if (matrix[k][g] >= 2 && matrix[k][g] <= 9){
                            sum += matrix[k][g];
                            proiz *= matrix[k][g];
                        }
                    }
                }
                System.out.println("Сумма = " + sum + ", произведение = " + proiz);
        }
    }
}

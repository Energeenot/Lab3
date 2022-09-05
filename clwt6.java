package Lab3;

import java.util.Scanner;

public class clwt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int [] array2 = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < n - 1; j++){
            array2[j+1] = array[j];
        }
        array2[0] = array[n-1];
        System.out.println("Преобразованный массив");
        for (int k = 0; k < n; k++){
            System.out.print(array2[k] + " ");
        }
    }
}

package Lab3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summax= -1;
        int k = 0;
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите n чисел");
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++){
            if (array[i-1] + array[i] > summax){
                summax = array[i-1] + array[i];
                k = i - 1;
            }
        }
        System.out.println(summax + " " + array[k] + " " + array[k + 1]);
    }
}

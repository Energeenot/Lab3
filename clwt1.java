package Lab3;

import java.util.Scanner;

public class clwt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sr = 0;
        int[] array = new int[10];
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        System.out.println("Введите 10 чисел");
        switch (letter){
            case "а":
                for (int i = 0; i < 10; i++){
                    array[i] = scanner.nextInt();
                }
                System.out.println(array[1] + " " + array[8]);
                break;
            case "б":
                for (int i = 0; i < 10; i++){
                    array[i] = scanner.nextInt();
                }
                for (int k = 0; k < 10; k++){
                    if (k % 2 != 0){
                        System.out.print(array[k] + " ");
                    }
                }
                break;
            case "в":
                for (int i = 0; i < 10; i++){
                    array[i] = scanner.nextInt();
                    sr += array[i];
                }
                System.out.println(sr / 10);
        }
        System.out.println();
        int[] array2 = {-2, 4, 3, -7, 0, 12, 9, -2, 4, 2};
        for (int j = 0; j < 10; j++){
            int sum = array[j] + array2[j];
            if (array2[j] < 0){
                System.out.println(array[j] + " + (" + array2[j] + ") = " + sum);
            }
            else System.out.println(array[j] + " + " + array2[j] + " = "+ sum);
            System.out.println("ddd");
        }
    }
}
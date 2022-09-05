package Lab3;

import java.util.Scanner;

public class clwt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            if ( i == 0){
                array[i] = 0;
            }
            else if (i == 1){
                array[i] = 1;
            }
            else if (i == 2){
                array[i] = 1;
            }
            else if (i > 2){
                array[i] = array[i-1] + array[i-2];
            }
        }

        for (int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
}

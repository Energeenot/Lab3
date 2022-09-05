package Lab3;

import java.util.Scanner;

public class clwt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[11];
        int sum = 0;
        int count = 0;
        int min = 1000000000;
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        System.out.println("Введите 11 чисел");
        switch (letter){
            case "а":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                    if (array[i] < 0){
                        sum += array[i];
                    }
                }
                System.out.println(sum);
                break;
            case "б":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                    if (array[i] > 0 && array[i] % 2 == 0){
                         count += 1;
                    }
                }
                System.out.println(count);
                break;
            case "в":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                    if (i % 2 == 0 && array[i] < min){
                        min = array[i];
                    }
                }
                System.out.println(min);
                break;
            case "г":
                int[] ar = new int[11];
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                    if (array[i] % 10 == 5){
                        ar[i] = i;
                    }
                }
                for (int k = 0; k < 11; k++){
                    System.out.print(ar[k] + " ");
                }
                break;
            case "д":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                }
                for(int i = 0; i < 11; i++){
                    String sr =  String.valueOf(array[i]);
                    if (sr.charAt(0) == '2' && sr.charAt(1) == '2'){
                        System.out.println(array[i]);
                    }
                }
                break;
            case "е":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                }
                for (int i = 0; i < 11; i++){
                    if (array[i] % 2 == 0){
                        System.out.println(array[i]);
                        break;
                    }
                }
            case "ж":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                }
                for (int i = 10; i > 0; i--){
                    if (array[i] < 0){
                        System.out.println(array[i]);
                        break;
                    }
                }
            case "к":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                }
                for (int i = 0; i < 11; i++){
                    String sr =  String.valueOf(array[i]);
                    if (array[i] >= 100 && (sr.charAt(0) == sr.charAt(1) || sr.charAt(0) == sr.charAt(2) || sr.charAt(2) == sr.charAt(1))){
                        System.out.println(array[i]);
                    }
                }
                break;
            case "л":
                for (int i = 0; i < 11; i++){
                    array[i] = scanner.nextInt();
                }
                for (int i = 0; i < 11; i++){
                    String sr =  String.valueOf(array[i]);
                    for (int j = 0; j < sr.length(); j++) {
                        if (sr.charAt(j) != sr.charAt(sr.length() - j - 1)) {
                            System.out.println(array[i]);
                        }
                    }
                }
        }
    }
}

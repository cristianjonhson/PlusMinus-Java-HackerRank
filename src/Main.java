import java.util.Scanner;

public class Main {

    public static void countNumbers(int[] arr) {
        int positive = 0, negative = 0, zeros = 0;
        int totalElements = arr.length; // Obtener el tamano del array

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.printf("%.6f\n", (double) positive / totalElements);
        System.out.printf("%.6f\n", (double) negative / totalElements);
        System.out.printf("%.6f\n", (double) zeros / totalElements);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countNumbers(arr);
    }
}

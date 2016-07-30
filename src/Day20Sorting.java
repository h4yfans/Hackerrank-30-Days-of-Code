import java.util.Scanner;

/**
 * Created by Kaan on 30.07.2016.
 */
public class Day20Sorting {

    private static int[] arr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        bubbleSort();


    }

    private static void bubbleSort() {
        int swap = 0;
        for(int i = 0; i < arr.length-1  ; i++){
            for (int j = i; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
        }

        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Elements: " + arr[0]);
        System.out.println("Last Elements: " + arr[arr.length-1]);

    }


}

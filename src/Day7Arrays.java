/**
 * Created by KAAN on 7/25/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day7Arrays {

    public static void main(String[] args) {
        // Get the input
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        // Var holding our new string
        String result = "";

        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i] + " ";
        }

        System.out.println(result);
    }
}
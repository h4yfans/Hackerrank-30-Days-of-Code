/**
 * Created by Kaan on 28.07.2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9Recursion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        System.out.println(factorial(number));


    }
     static int factorial(int n){
        if(n == 1) return 1;

        return n * factorial(n-1);

    }

}
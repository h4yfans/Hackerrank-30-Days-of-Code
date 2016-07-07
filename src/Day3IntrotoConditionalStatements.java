/**
 * Created by Kaan Karaca on 05/07/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3IntrotoConditionalStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //use modulus operator to determine if N is odd
        if (N % 2 != 0) {
            //remainder of N/2 is not 0, meaning odd
            System.out.println("Weird");
        } else if ((N % 2 == 0) && (N >= 2 && N <= 5)) {
            //remainder of N/2 is 0, meaning even
            System.out.println("Not Weird");
        } else if ((N % 2 == 0) && (N >= 6 && N <= 20)) {
            //remainder of N/2 is 0, meaning even
            System.out.println("Weird");
        } else if ((N % 2 == 0) && N > 20) {
            //remainder of N/2 is 0, meaning even
            System.out.println("Not Weird");
        }
    }
}

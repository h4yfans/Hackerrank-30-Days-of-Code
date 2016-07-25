/**
 * Created by KAAN on 7/8/2016.
 */

import java.io.*;
import java.util.*;

public class Day5Loops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
/**
 * Created by Kaan on 29.07.2016.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;
    }


    int computeDifference(){
        int max = 1;
        int min = 100;
        for(int element : elements){
            if(element < min){
                min = element;
            }
            if (element>max){
                max = element;
            }

            maximumDifference = Math.abs(max-min);
        }
        return maximumDifference;
    }




} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
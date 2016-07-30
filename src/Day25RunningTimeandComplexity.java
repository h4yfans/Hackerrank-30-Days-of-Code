/**
 * Created by Kaan on 30.07.2016.
 */
import java.io.*;
import java.util.*;

public class Solution {

    static boolean isPrime(int n){
        boolean cond = true;
        for(int i = 2; i < n/2 ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTests = sc.nextInt();
        for (int i = 0; i < numOfTests; i++) {
            int x = sc.nextInt();
            String s;
            if (x >= 2 && isPrime(x)) {
                s = "Prime";
            } else {
                s = "Not prime";
            }
            System.out.println(s);
        }
    }
}
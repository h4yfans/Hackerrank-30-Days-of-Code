import java.util.Scanner;

/**
 * Created by Kaan Karaca on 05/07/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 */

public class Day1DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);


         /* Declare second integer, double, and String variables. */
        int j;
        double e;
        String string;
        /* Read and save an integer, double, and String to your variables.*/
        j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine();
        string = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + e);
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + string);
        scan.close();
    }
}
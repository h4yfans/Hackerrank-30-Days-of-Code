/**
 * Created by Kaan Karaca on 05/07/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * https://www.hackerrank.com/challenges/30-hello-world
 */


import java.util.Scanner;

public class Day0HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
        System.out.println(inputString);

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
    }
}
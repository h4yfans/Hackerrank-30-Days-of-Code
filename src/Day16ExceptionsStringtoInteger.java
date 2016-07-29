import java.util.Scanner;

/**
 * Created by Kaan on 29.07.2016.
 */
public class Day16ExceptionsStringtoInteger {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        try {
            int number = scan.nextInt();
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Bad String");
        }


    }
}

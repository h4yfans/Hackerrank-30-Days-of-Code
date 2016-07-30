import java.util.Scanner;

/**
 * Created by Kaan on 30.07.2016.
 */

class BookReturnDay {
    public int day;
    public int month;
    public int year;

    public BookReturnDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}


public class Day26NestedLogic {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        BookReturnDay actual = new BookReturnDay(scan.nextInt(),scan.nextInt(),scan.nextInt());
        BookReturnDay expected = new BookReturnDay(scan.nextInt(),scan.nextInt(),scan.nextInt());
        scan.close();

        int fine = 0;

        if (expected.year == actual.year){
            if (expected.month < actual.month){
                fine = (actual.month-expected.month) * 500;
            }else if(expected.month == actual.month){
                fine = (actual.day - expected.day) * 15;
            }
        }else if(expected.year < actual.year){
            fine = 10000;
        }
        System.out.println(fine);
    }

}

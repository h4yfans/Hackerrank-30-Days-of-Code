/**
 * Created by Kaan on 30.07.2016.
 */


class Solution {
    //Write your code here

    public static <E> void printArray(E[] n) {
        for(E i : n) {
            System.out.println(i);
        }
    }


    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);

        if (Solution.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method named printArray.");
        }
    }




}
}
package Practicals.Pr_5;

/*   Write a program in Java to reverse the digits of a number using while 1 loop */

public class Practical_5 {
    public static void main(String[] args) {
        int number = 98765,revers = 0;
        while (number != 0) {
            int reminder = number % 10;
            revers = revers * 10 + reminder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + revers);
    }
}

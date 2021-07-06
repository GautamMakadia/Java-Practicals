package Practicals.Pr_4;

/* Write a program in Java to find second maximum of n numbers 2 without using arrays */

import java.util.Scanner;

public class Practical_4 {
    public static void main(String[] args) {

        int num, FBig=0, SBig=0;
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        System.out.println("Enter The "+limit+" Number.");

        while (limit > 0) {
            num = sc.nextInt();
            if (num > FBig) {
                SBig = FBig;
                FBig = num;
            } else if (num > SBig) {
                SBig = num;
            }
            limit--;
        }

        System.out.println(FBig+" Is First Max. Number.");
        System.out.println(SBig+" Is Second Max. Number.");
    }
}

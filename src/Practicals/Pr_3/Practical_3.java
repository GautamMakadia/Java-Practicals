package Practicals.Pr_3;

import java.util.Scanner;

public class Practical_3 {
    public static void main(String[] args) {
        int n1; //3
        int n2; //2
        int n3; //1

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N1 : ");
        n1 = sc.nextInt();
        System.out.print("Enter The Value Of N2 : ");
        n2 = sc.nextInt();
        System.out.print("Enter The Value Of N3 : ");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1+"Is Max. Number");
        }else if (n2 > n1 && n2 > n3) {
            System.out.println(n2+" Is Max. Number");
        }else {
            System.out.println(n3+" Is Max. Number");
        }

    }
}

package Java_If_else;

import java.util.Scanner;

public class check_Its_LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check its odd or even :");
        int year= sc.nextInt();
        if (year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("The given year is a leap year :");
        }else {
            System.out.println("The given year is not a leap year :");
        }
    }
}

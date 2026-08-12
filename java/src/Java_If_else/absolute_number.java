package Java_If_else;

import java.util.Scanner;

public class absolute_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check its absolute number :");
        int num= sc.nextInt();
        if(num<0){
            num*=(-1);
            System.out.println(num+" is a absolute value");
        }
    }
}

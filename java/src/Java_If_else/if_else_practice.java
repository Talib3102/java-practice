package Java_If_else;

import java.util.Scanner;

public class if_else_practice {
    //check if given number is odd or even
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check its odd or even :");
        int num= sc.nextInt();
        if (num%2==0){
            System.out.println("Your number is even :");
        }else {
            System.out.println("your number is odd :");
        }
    }
}

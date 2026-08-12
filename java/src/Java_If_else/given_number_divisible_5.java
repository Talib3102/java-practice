package Java_If_else;

import java.util.Scanner;

public class given_number_divisible_5 {
    //check given number is divisible by 5
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check its divisible by 5 :");
        int num= sc.nextInt();
        if (num%5==0){
            System.out.println("the number is divisible by 5 ");
        }else {
            System.out.println("the number is not divisible by 5");
        }
    }
}

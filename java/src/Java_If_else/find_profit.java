package Java_If_else;

import java.util.Scanner;

public class find_profit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check its odd or even :");
        double cp= sc.nextDouble();
        double sp= sc.nextDouble();
        double profit=0;
        double loss=0;
        if (sp>cp){
            profit+=sp-cp;
            System.out.println(profit+" your profit ");
        }else {
            loss+=sp-cp;
            System.out.println(loss+" your loss");
        }
    }
}

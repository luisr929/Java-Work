package Class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number= input.nextInt();
        while(number!=-1){
            System.out.println("try again");
            number=input.nextInt();

        }
    }
}

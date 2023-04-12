package Class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number?");
        int number= input.nextInt();
        int counter=1;
        while(counter<=number){
            System.out.print(counter+" ");
            counter++;
        }
    }
}

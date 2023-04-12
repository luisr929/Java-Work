package Class6;

import java.util.Scanner;

public class Calculatorif {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number=input.nextInt();
        System.out.println("enter operator");
        char operator = input.next().charAt(0);
        System.out.println("enter last number");
        int num2=input.nextInt();
        double sum=number+operator+num2;
        System.out.println(sum);






    }
}



package Class4;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("what amount of loan is needed?");
        int loan=scan.nextInt();
        if (loan<=200000){
            System.out.println("lend the money");
        }else{
            System.out.println("reject");
        }
    }
}

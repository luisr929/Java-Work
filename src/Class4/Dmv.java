package Class4;

import java.util.Scanner;

public class Dmv {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("how old are you numbers only");
        int age= scanner.nextInt();

        if (age>=18){
            System.out.println("drivers license issued");
        }else{
            System.out.println("learners permit");
        }



    }
}

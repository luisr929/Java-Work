package Class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how old are you?");
        int age=scanner.nextInt();

        if (age<18){
            System.out.println("you cant drive");
        }else{
            System.out.println("we have to print your DL");
        }
    }
}

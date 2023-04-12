package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter you salary");
        int salary=scanner.nextInt();
        if (salary>100000){
            System.out.println("you are rich");
        }else {
            System.out.println("look for better opportunities");
        }
    }
}

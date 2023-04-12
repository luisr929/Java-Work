package Class6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("how tall are you in inches?");
        int inches=scanner.nextInt();

        if (inches<60){
            System.out.println("short");
        }else if (inches>60 && inches<72){
            System.out.println("medium");
        }else {
        System.out.println("tall");
        }
    }
}

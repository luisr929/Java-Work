package Class6;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter grade letter");
        String grade = input.next();
        if (grade.equals("A")) {
            System.out.println("A-Excellent");
        } else if (grade.equals("B")) {
            System.out.println("B-Good");
        } else if (grade.equals("C")) {
            System.out.println("C-Average");
        } else if (grade.equals("D")) {
            System.out.println("D-Bad");
        } else {
            System.out.println("not acceptable");
        }
    }
}

package Class6;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what month were you born?");
        String month = input.next();
        if (month.equals("January")) {
            System.out.println("winter");
        } else if (month.equals("feb")) {
            System.out.println("Winter");

        } else if (month.equals("March")) {
            System.out.println("winter");
        } else if (month.equals("April")) {
            System.out.println("spring");
        } else if (month.equals("May")) {
            System.out.println("spring");
        } else if (month.equals("June")) {
            System.out.println("Spring");
        } else if (month.equals("July")) {
            System.out.println("summer");
        } else if (month.equals("August")) {
            System.out.println("summer");
        } else if (month.equals("September")) {
            System.out.println("summer");
        } else {
            System.out.println("fall");
        }

    }
}

package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a starting point, ending point ");
        int start=input.nextInt();
        int end= input.nextInt();
        int counter=start;
        while (counter <= end) {
            System.out.print(counter+" ");
            counter++;
        }
        }
    }


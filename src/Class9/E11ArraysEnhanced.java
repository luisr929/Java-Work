package Class9;

import java.util.Scanner;

public class E11ArraysEnhanced {
    public static void main(String[] args) {
        int [] numbers=new int[3];
        Scanner input=new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter int numbers");
            numbers[i]=input.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

package Class4;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter your city");
        String city=scanner.nextLine();
        System.out.println("enter temperature in fahrenhiet");
        double temperature=scanner.nextDouble();
        double celcius=(temperature-32)*(0.5556);
        System.out.println("the temperature is "+celcius+" celcius in "+city);






    }

}

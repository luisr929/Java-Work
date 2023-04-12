package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name");
        String name= scan.next();

        if(name.equals("Elana")){
            System.out.println("mac user");
        }else if (name.equals("Safyan")){
            System.out.println("naughty");
        }else if (name.equals("halima")){
            System.out.println("best");
        }else if (name.equals("axel")){
            System.out.println("bad boy");
        }
    }
}

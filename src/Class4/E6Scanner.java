package Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name");
        String name= scan.next();

        if(name.equals("Elana")){
            System.out.println("mac user");
        }else{
            System.out.println("windows user");
        }
    }
}

package Class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        int counter = 100;

        while (counter > 0) {
            System.out.print(counter + " ");
            counter--;
        }
        int counter2 = 20;
        System.out.println();
        while (counter2 < 101) {
            System.out.print(counter2+" ");
            counter2+=2;
        }
        int counter3=100;
        System.out.println();
        while(counter3>0){
            if (counter3%2!=0){
                System.out.print(counter3+" ");
            }counter3--;
        }

        }
    }


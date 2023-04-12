package Class6;

public class Numbers {
    public static void main(String[] args) {

        int number = 100;

        if (number<=10){
            System.out.println("small");
        } else if (number>10 && number<=100) {
            System.out.println("medium");
        } else if (number>100 && number<=1000) {
            System.out.println("large");
        }
    }
}
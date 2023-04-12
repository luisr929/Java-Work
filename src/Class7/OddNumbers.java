package Class7;

public class OddNumbers {
    public static void main(String[] args) {
        int counter = 20;
        while (counter < 51) {
            if (counter % 2 != 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}
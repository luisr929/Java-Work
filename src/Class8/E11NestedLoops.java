package Class8;

public class E11NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int counter = 0;
        while (counter < 4) {

            counter++;
        }
    }
}



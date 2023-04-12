package Class3;

public class PostiveOrEven {
    public static void main(String[] args) {
        int time = 2;
        if (time > 0) {
            System.out.println("postive");
        } else {
            System.out.println("negative");
        }
        int one = 8;
        int remainder = one % 2;
        if (remainder == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

package Class6;

public class Score {
    public static void main(String[] args) {

        int score = 45;

        if (score >= 90) {
            System.out.println("grade = A");
        } else if (score >= 70 && score < 90) {
            System.out.println("grade = B");
        } else if (score >= 50 && score <= 70) {
            System.out.println("grade = C");
        } else {
            System.out.println("grade = F");

        }
    }
}

package Class6;

public class Time {
    public static void main(String[] args) {

        int time=21;

        if (time<=11){
            System.out.println("morning");
        } else if (time>11 && time<=15) {
            System.out.println("afternoon");
        }else if (time>15 && time<=20){
            System.out.println("evening");
        }else if (time>20 && time<=24){
            System.out.println("night");
        }
    }
}
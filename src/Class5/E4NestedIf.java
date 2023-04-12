package Class5;

public class E4NestedIf {
    public static void main(String[] args) {
        int money = 1000;
        String day = "friday";
        if (money < 10000) {
            if (day.equals("sunday")){
                System.out.println("lets go shoppin");

            } else {
                System.out.println("lets wait for sunday");
            }
        }else {
            System.out.println("lets save more");
        }
    }
}

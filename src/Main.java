public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenish = 1200;
        int check;
        int bonus;
        if (replenish > 1000) {
            check = balance + replenish;
            bonus = replenish / 100;
            System.out.println(check);
            {
                System.out.println(bonus);
            }
        } else {
            check = balance + replenish;
            System.out.println(check);
        }
    }
}
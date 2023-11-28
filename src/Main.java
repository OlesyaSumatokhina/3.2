public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenish = 400;
        int finish;
        int check;
        int bonus;
        if (replenish > 1000) {
            bonus = replenish / 100;
            finish = balance + replenish + bonus;
            System.out.println(finish);
            {
                System.out.println(bonus);
            }
        } else {
            check = balance + replenish;
            System.out.println(check);
            {
                System.out.println("Бонусов нет");
            }
        }
    }
}
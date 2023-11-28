public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenish = 800;
        int check = balance + replenish;
        int bonus = replenish / 100;
        if (replenish >= 1000) {
            System.out.println(check + bonus);
        } else {
            System.out.println(check);
        }
    }
}

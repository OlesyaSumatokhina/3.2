public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenish = 1800;
        int check = balance + replenish;
        int difference = check - 100;
        int bonus = difference / 100;
        if (replenish >= 1000) {
            System.out.println(check + bonus);
        } else {
            System.out.println(check);
        }
    }
}

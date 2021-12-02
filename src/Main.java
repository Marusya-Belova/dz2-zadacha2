public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int bonus;
        if (refill <= 100) {
            bonus = 0;
            System.out.println("Bonus = 0");
        } else {
            bonus = refill / 100;
            System.out.print("Bonus = ");
            System.out.println(bonus);
        }
        int resultBalance = balance + refill + bonus;
        System.out.print("Result Balance = ");
        System.out.println(resultBalance);
    }
}
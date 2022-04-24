public class Main {
    public static void main(String[] args) {
        int check = 100; // Сумма на счету клиента
        int payment = 2000; // Сумма пополнения счета
        int bonus; // Количество начисленных бонусов
        System.out.println("Вы пополнили счет на " + payment + " руб.");
        if (payment >= 1000) {

            bonus = payment / 100;
            System.out.println("Вам начислен бонус в размере: " + bonus + " руб.");
        } else {
            bonus = 0;
        }
        int sum = check + payment + bonus; // Итого на счете, учитывая изначальную сумму, сумму пополнения и бонус
        System.out.println("На счету: " + sum + " руб.");

    }
}

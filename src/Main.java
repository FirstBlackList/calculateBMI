public class Main {
    public static void main(String[] args) {

        BmiService b = new BmiService();
        System.out.println("Для рассчёта ИМТ:\nПервым параметром введите Ваш вес в килограммах: " +
                "\nВторым параметром Ваш рост в метрах: ");
        double result = b.calculate(78, 1.8);
        if (Math.round(result) <= 25) {
            System.out.println("Всё отлично, Ваш ИМТ = " + Math.round(result));
        } else {
            System.out.println("Ваш ИМТ превышает норму '25' и равен: " + Math.round(result));
        }
    }
}
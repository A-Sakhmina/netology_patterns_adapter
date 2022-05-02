import adapter.Ints;
import adapter.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        //демонстрация
        int arg0 = 2, arg1 = 2;
        System.out.printf("Сложение %d и %d: %d\n", arg0, arg1,calc.sum(arg0, arg1));
        arg0 = 10;
        arg1 = 22;
        System.out.printf("Умножение %d на %d: %d\n", arg0, arg1,calc.mult(arg0, arg1));
        arg0 = 2;
        arg1 = 10;
        System.out.printf("Возведение %d в степень %d: %d\n", arg0, arg1, calc.pow(arg0, arg1));
    }
}

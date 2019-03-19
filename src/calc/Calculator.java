package calc;

/**
 * Created by asus on 04.03.2019.
 */
public class Calculator {
    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b != 0)
        {
            return a / b;
        }
        else
        {
            System.out.println("Нельзя делить на ноль");
            return 0;
        }
    }
}
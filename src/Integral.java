import java.util.function.DoubleUnaryOperator;

/**
 * Created by volfovskaya on 10.04.17.
 */
public class Integral {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0;
        for (double i = a; i < b; i = i + 10E-6) {
            result = result + f.applyAsDouble(i)*10E-6;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }


}

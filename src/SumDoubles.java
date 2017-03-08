/**
 * Created by volfovskaya on 16.12.16.
 */
public class SumDoubles {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 1E-4;
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2,0.3));
    }
}

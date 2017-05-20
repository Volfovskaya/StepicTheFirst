/**
 * Created by volfovskaya on 16.04.17.
 */
public class CalcSqrt {
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        else return Math.sqrt(x);
    }
}

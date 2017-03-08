/**
 * Created by volfovskaya on 14.12.16.
 */
public class BooleanExpression {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return returnDigit(a) + returnDigit(b) + returnDigit(c) + returnDigit(d) == 2;
    }

    public static int returnDigit(boolean o) {
        if (o) {
            return 1;
        } else {
            return 0;
        }
    }
}

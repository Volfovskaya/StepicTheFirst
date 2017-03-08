/**
 * Created by volfovskaya on 18.12.16.
 */
public class GetSlash {
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static void main(String[] args) {
        System.out.println(charExpression(4));

        float b = 2.4f;
        long c = (long) b;
        byte d = 3;
        char e = (char) d;
        long digitLong = 123L;
        b = digitLong;
        int digitInt;
        digitInt = e;
        Character digitChar = 'M';
        e = digitChar;
        int zero = 0;

    }
}

/**
 * Created by volfovskaya on 18.12.16.
 */
public class PowerOfTwo {
    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return value != 0 && Integer.highestOneBit(Math.abs(value)) == Math.abs(value);
    }


    private static boolean isPowerOfTwo2(int value) {

        int absValue = Math.abs(value);
        double log2 = log2(absValue);
        return log2 == (int) log2;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo2(4));
        System.out.println(isPowerOfTwo2(32));
        System.out.println(isPowerOfTwo2(35));
        System.out.println(log2(7));
    }

    private static double log2(double value) {
        return Math.log(value) / Math.log(2);
    }

}

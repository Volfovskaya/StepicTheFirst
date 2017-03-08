import java.util.ArrayList;
import java.util.List;

/**
 * Created by volfovskaya on 16.12.16.
 */
public class ChangeBit {
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1); // put your implementation here
    }

    public static void main(String[] args) {
        System.out.println(flipBit(15, 5)); // 11111 10000
//        System.out.println((~(1 << 2)) & ~(1<<30));
    }
}
// 100 | 101 = 101
// 100 & 101 = 100
// 101 << 1 = 1010
// 101 ^ 100 = 001
// ~101 = 010 = 10



// 0 ^ 0 = 0
// 0 ^ 1 = 1
// 1 ^ 0 = 1
// 1 ^ 1 = 0
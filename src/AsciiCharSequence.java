import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by volfovskaya on 12.04.17.
 */
public class AsciiCharSequence implements CharSequence {

    private byte[] arrayOfAscii;

    AsciiCharSequence() {
        arrayOfAscii = new byte[0];
    }

    AsciiCharSequence(byte[] acChars) {
        arrayOfAscii = acChars;
    }

    @Override
    public int length() {
        return arrayOfAscii.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrayOfAscii[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subAsciiArr = new byte[end - start];
        for (int i = start; i < end; i++) {
            subAsciiArr[i - start] = arrayOfAscii[i];
        }
        return new AsciiCharSequence(subAsciiArr);
    }

    @Override
    public String toString() {
        return new String(arrayOfAscii);
    }

    public static final byte[] CDRIVES = new byte[] {46, 50, 52, 54, 55, 66, 70};

    public static void main(String[] args) {
        AsciiCharSequence example = new AsciiCharSequence(CDRIVES);

        System.out.println(example);
        System.out.println(example.subSequence(1, 5));

        List<CharSequence> sequences = new ArrayList<>();
        sequences.add(example);
        sequences.add("hello");
        sequences.add(example.subSequence(1, 3));

        List<CharSequence> linkedList = new LinkedList<>();
        linkedList.add("blblbl");

        System.out.println(sequences);
        System.out.println("---");
        System.out.println(linkedList);
    }
}

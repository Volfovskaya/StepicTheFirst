import java.math.BigInteger;

/**
 * Created by volfovskaya on 19.12.16.
 */
public class FactorialProcessing {
    public static BigInteger factorial(int value) {
        BigInteger resultFactorial = BigInteger.ONE;
        for (int i = 2; i <= value; i++) {
            resultFactorial = resultFactorial.multiply(BigInteger.valueOf(i));
        }
        return resultFactorial;
    }

    public static void main(String[] args) {
        System.out.println(FactorialProcessing.factorial(100));
        //System.out.println('A'+'1'+"2"); не работает как А12
        //System.out.println("A"+12);
        //System.out.println("A"+('\t'+'\u0003'));
        //System.out.println('A'+"12");

    }
}


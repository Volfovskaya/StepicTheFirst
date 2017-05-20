/**
 * Created by volfovskaya on 16.04.17.
 */
public class A {

    A (Object o) {
        Integer a = (Integer) o;
    }


    public static void main(String[] args) {
        Object o = new Integer(2);
        A a = new A(o);
    }
}

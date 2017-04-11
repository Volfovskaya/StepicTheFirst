import java.util.Comparator;

/**
 * Created by volfovskaya on 04.04.17.
 */
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
//
//    @Override
//    public boolean equals(Object cN) {
//        if (cN instanceof ComplexNumber) {
//            ComplexNumber comNumb = (ComplexNumber) cN;
//            return (this.re == comNumb.re && this.im == comNumb.im);
//        }
//        else
//            return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return (int) (re*100 + im*100);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexNumber that = (ComplexNumber) o;

        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(2,4);
        ComplexNumber c = a;
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(c));

    }

}

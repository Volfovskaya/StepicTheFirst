/**
 * Created by volfovskaya on 15.12.16.
 */
public class CalculateYear {
    public static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }

    public static int getYear(int year) {
        int countOfYears = 0;
        for (int i = 1; i <= year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                countOfYears++;
            }
        }
        return countOfYears;
    }

    public static void main(String[] args) {
        System.out.println(getYear(1));
        System.out.println(getYear(4));
        System.out.println(getYear(300));

    }
}


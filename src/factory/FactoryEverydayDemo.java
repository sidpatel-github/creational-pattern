package factory;

import java.util.Calendar;
import java.util.Locale;

public class FactoryEverydayDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar = Calendar.getInstance(Locale.CHINA);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}

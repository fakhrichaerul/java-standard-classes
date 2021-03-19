package fakhri.java.standard.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        // Deprecated
        Date tanggal = new Date();

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, +10);
        calendar.set(Calendar.MONTH, 02);
        calendar.set(Calendar.DATE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 18);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}

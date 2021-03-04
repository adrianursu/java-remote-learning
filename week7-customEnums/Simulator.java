package main.java.com.iquest.customEnums;

import java.util.Date;

public class Simulator {

    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(1997, 1, 4);

        System.out.println(DayEnum.values()[date1.getDay()] + ", " + MonthEnum.values()[date1.getMonth()] + ", " + (date1.getYear()));
        System.out.println(DayEnum.values()[date.getDay()] + ", " + MonthEnum.values()[date.getMonth()] + ", " + (date.getYear() + 1900));
    }
}

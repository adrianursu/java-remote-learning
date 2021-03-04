package main.java.com.iquest.customEnums;

import java.util.Date;

public class Simulator {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(DayEnum.values()[0] + ", " + MonthEnum.values()[2] + ", " + (date.getYear() + 1900));
    }
}

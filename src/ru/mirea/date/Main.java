package ru.mirea.date;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("E, d-M-y 'at', h:m:s a z");

        Date date = new Date();
        long twoDaysInMs = 4L * 24 * 60 * 60 * 1000;
        Date date2 = new Date(System.currentTimeMillis() + twoDaysInMs);

        System.out.println("Имя разработчика: Дмитрий Мальцев");
        System.out.println("Дата выдачи задания: " + format.format(date));
        System.out.println("Дата сдачи задания: " + format.format(date2));

    }
}

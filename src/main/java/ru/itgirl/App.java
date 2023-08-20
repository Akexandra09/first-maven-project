package ru.itgirl;

import java.util.Scanner;

/**
 * Hello world!
 */

public class App {
    enum Week {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

    public static void main(String[] args) {
        System.out.println("Введите день недели:");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String dayInRussian = "Понедельник";
        switch (Week.valueOf(day)) {
            case Monday:
                dayInRussian = "Понедельник";
                break;
            case Tuesday:
                dayInRussian = "Вторник";
                break;
            case Wednesday:
                dayInRussian = "Среда";
                break;
            case Thursday:
                dayInRussian = "Четверг";
                break;
            case Friday:
                dayInRussian = "Пятница";
                break;
            case Saturday:
                dayInRussian = "Суббота";
                break;
            case Sunday:
                dayInRussian = "Воскресенье";
                break;
        }
        System.out.println("Сегодня " + dayInRussian);
    }
}
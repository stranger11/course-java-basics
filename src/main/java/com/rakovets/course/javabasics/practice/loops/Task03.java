package com.rakovets.course.javabasics.practice.loops;

import java.util.Locale;
import java.util.Scanner;

/**
 * Разработать программу для банка:
 * Необходимо расчитать прибыль, которую получит клиент по вкладу с ежегодным перерасчетом. Известно:
 *
 * @param depositAmount        сумма вклада
 * @param annualDepositPercent ежегодный процент вклада
 * @param depositTerm          продолжительность вклада (в годах)
 * @author Dmitry Rakovets
 * @version 1.0
 * @return прибыль округленную математически
 */
public class Task03 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        double depositAmount = (args.length != 3 ? scanner.nextDouble() : Double.parseDouble(args[0]));
        double annualDepositPercent = (args.length != 3 ? scanner.nextDouble() : Double.parseDouble(args[1]));
        int depositTerm = (args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[2]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        for (int i = 1; i <= depositTerm; i++ ){
            double depozit = depositAmount * annualDepositPercent / 100.0;
            depositAmount = depositAmount + depozit;
        }
        String res = String.format(Locale.ROOT,"%.2f", depositAmount);
        System.out.println(res);
    }
}
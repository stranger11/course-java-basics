package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Спрогнозировать через какое время party(team) игроков убьет RaidBoss и получит вознаграждение. Известно:
 *
 * @param healthPoints               количество HP RaidBoss
 * @param regenerationPercentPerHour регенерация HP RaidBoss (%/hour)
 * @param averageDamagePerHour       средний урон команды игроков по Raid Boss (HP/hour)
 * @author Dmitry Rakovets
 * @version 1.0
 * @return время для убийства RaidBoss (когда party не справляется за 24 часа, то вывести -1)
 */
public class Task05 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        int healthPoints = (args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[0]));
        double regenerationPercentFromCurrentHealth = (args.length != 3 ? scanner.nextDouble() : Double.parseDouble(args[1]));
        int averageDamagePerHour = (args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[2]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int chas = 0;
        double currentHealthPoints = healthPoints;
        while (currentHealthPoints > 0) {
            currentHealthPoints = (currentHealthPoints + (currentHealthPoints * regenerationPercentFromCurrentHealth / 100)) - averageDamagePerHour;
            chas++;
            if (chas > 24) {
                break;
            }
        }
        if (currentHealthPoints > 0) {
            System.out.println("-1");
        } else {
            System.out.println(chas);
        }
    }
}


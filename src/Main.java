import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Task 1");
        for (int i = 0; i < 11; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i = i--) {
            System.out.println(i--);
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        for (int i = 10; i > -11; i = i--) {
            System.out.println(i--);
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Task 8");
        int sum = 0;
        int part = 29000;
        for (int i = 1; i <= 12; i++) {
            sum += part;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Task 9");
        double forStart = 0;
        double part = 29000;
        double percent = 0.01;
                for (int i = 1; i <= 12; i++) {
                    forStart = (forStart + part) * (1+percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + forStart + " рублей");
        }
    }
    public static void task10() {
        System.out.println("Task 10");

    }
}

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градуса, сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градуса, сегодня холодно, нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 35;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        }
        if (age >= 19 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 4;
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст человека равен " + age + " лет, то он может кататься на аттракционе только в сопровождении взрослого.");
        }
        if (age >14) {
            System.out.println("Если возраст человека равен " + age + " лет, то он может кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то он не может кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 55;
        int capacity = 102;
        int sitPlace = 60;
        if (passengers <= capacity) {
            if (passengers <= sitPlace) {
                System.out.println("Сидячие места имеются в вагоне.");
            }else {
                System.out.println("Стоячие места имеются в вагоне.");
            }
        } else {
            System.out.println("Мест нет.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 10;
        int two = 11;
        int three = 8;

        if (one >= two && one >= three) {
            System.out.println("Первое число больше остальных");
        }
        if (two >= one && two >= three) {
                System.out.println("Второе число больше остальных");
        }
        if (three >= one && three >= two) {
                System.out.println("Третье число больше остальных");
        } else {
                System.out.println("");
        }
    }
}
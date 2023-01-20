public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 2;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int age = 21;
        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад.");
        }else {
            System.out.println(";
        if (age >=7 && age <=18) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу.");
        }else {

        if (age >18 && age <=24) {
            System.out.println("Если возраст человека равен " + age + ",то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то ему не место в университете.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ",то ему пора на работу.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 10;
        if (age >5) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        }
        if (age >5 && age <14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age >14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то ему не место в университете.");
    }
}
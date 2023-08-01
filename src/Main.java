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

    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + ' ' + paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + ' ' + paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + ' ' + paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг!");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе " + weightDifference + " кг!");

    }
    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе " + weightDifference + " кг!");
        var weightDifferenceDuvision = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе " + weightDifferenceDuvision + " кг!");

    }
    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        var totalTime = 640;
        var workerTime = 8;
        var numberOfEmployees = totalTime / workerTime;
        System.out.println("Всего работников в компании " + numberOfEmployees + "человек");
        var increase = numberOfEmployees + 94;    // увеличение сотрудников
        var totalTime2 = increase * 8;
        System.out.println("Если в компании работает " + increase + " человек, то всего " + totalTime2 + " часов работы может быть поделено между сотрудниками");

    }
}
public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog     = 8.0;
        var cat     = 3.6;
        var paper   = 763789;
        System.out.print("dog = ");System.out.println(dog);
        System.out.print("cat = ");System.out.println(cat);
        System.out.print("paper = ");System.out.println(paper);
    }


    public static void task2 () {
        System.out.println("Задача 2");
        var dog     = 8.0;
        var cat     = 3.6;
        var paper   = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.print("dog = ");System.out.println(dog);
        System.out.print("cat = ");System.out.println(cat);
        System.out.print("paper = ");System.out.println(paper);
    }


    public static void task3 () {
        System.out.println("Задача 3");
        var dog     = 8.0;
        var cat     = 3.6;
        var paper   = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.print("dog = ");System.out.println(dog);
        System.out.print("cat = ");System.out.println(cat);
        System.out.print("paper = ");System.out.println(paper);
    }


    public static void task4 () {
        System.out.println("Задача 4");
        var friend     = 19;
        System.out.print("Инициализация: friend = ");System.out.println(friend);
        friend += 2;
        System.out.print("Увеличение на 2: friend = ");System.out.println(friend);
        friend /= 7;
        System.out.print("Деление на 7: friend = ");System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog     = 3.5;
        System.out.print("Инициализация: frog = ");System.out.println(frog);
        frog *= 10;
        System.out.print("Умножение на 10: frog = ");System.out.println(frog);
        frog /= 3.5;
        System.out.print("Деление на 3.5: frog = ");System.out.println(frog);
        frog += 4;
        System.out.print("Увеличение на 4: frog = ");System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        var aBoxerWeight= 78.2;
        var bBoxerWeight= 82.7;

        var totalWeight = aBoxerWeight + bBoxerWeight;
        System.out.println("Общий вес двух бойцов "+totalWeight+" кг");

        var weightDifference = aBoxerWeight - bBoxerWeight;
        System.out.println("Вес боксёра A больше веса боксёра B на "+weightDifference+" кг");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        var aBoxerWeight= 78.2;
        var bBoxerWeight= 82.7;

        var plusWeightDifference =  bBoxerWeight - aBoxerWeight;
        System.out.println("Разница в весе через вычитание из большего: "+plusWeightDifference+" кг");

        var plusModuloWeightDifference =  bBoxerWeight % aBoxerWeight;
        System.out.println("Разница в весе через функцию остаток от деления на большее: "+plusModuloWeightDifference+" кг");

        /*От задания осталось негативное впечатление. Пока не известен инструментарий определить какое значение больше.
        Прошлая задача при переходе к корявому языку позволяла не потерять эти данные.
         Сам метод остатка дополнительно слишком частный и не учитывает превышение показателя в разы
         */
    }


    public static void task8 () {
        System.out.println("Задача 8");
        var totalWorkTime   = 640;
        var workingHours    = 8;

        var numberEmployees =  totalWorkTime / workingHours;
        System.out.println("Всего работников в компании — "+numberEmployees+" человек");

        var addNubmberEployees = 94;
        var imagineNumberEmployees = numberEmployees + addNubmberEployees;
        System.out.println("Если в компании работает "+imagineNumberEmployees+" человек, то всего "
                +imagineNumberEmployees*workingHours+" часов работы может быть поделено между сотрудниками");


        /*Задача крайне не логична. Количество часов не может быть так просто поделено между сотрудниками, так как невозможно
        загрузить одного сотрудника в счёт другого выше 8 часов. Объём работы не связан напрямую с объёмом персонала и т.д.
        Я так понимаю урок в том, что ТЗ превыше здравого смысла
         */
    }

}
public class Main {
    public static void main(String [ ] args) {
        //Задание 1.
        int gecko = 20;
        byte dog = 1;
        short snake = 3;
        double sugarWeight = 2.2;
        float saltWeight = 1.2F;
        boolean geckoIsAdult =gecko > 15;
        long whale = 123;
        char Del = 42;
        System.out.println (Del);
        System.out.println ("The lifespan of geckos is up to 20 years is : " + geckoIsAdult + "!");

        // Задание 2.
        // Два брйца вес каждго различается боец первый 78,2 ;боец второй 82,7 кг
        double massaFighter_1 = 78.2;
        double massaFighter_2 = 82.7;
        // Общий вес бойцов
        double totalWeight = massaFighter_1 + massaFighter_2;
        System.out.println("Total weight of fighters " + totalWeight + " kg/КГ ! " );

        //посчет разници (боец 1 + боец 2) % общий вес
        double weightDifference =( massaFighter_2 - massaFighter_1) % totalWeight;
        System.out.println("Weight difference of fighters " + weightDifference + " kg/КГ ! " );


        //Задание 3.
        // Питание сптсмена:
        int bananaWeight = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int rawEggs = 4 * 70;
        int BreakfastOfTheChampion = bananaWeight + milk + iceCream + rawEggs;
        System.out.println("Breakfast of the champion " + BreakfastOfTheChampion +" gram");
        System.out.println("Breakfast of the champion in kilkgram " + BreakfastOfTheChampion / 1000 + " kg" );

        //задание 4.
        // Нужно потерять всего 7 кг V_1 по 250 грамм, V_2 по 500 грамм.
        // вопрос за сколько дней это произойдет?
        //V_1
        int weightLoss_25 = 250;
        int weightLoss_50 = 500;
        int weightLoss_V1 =(7 * 1000)/weightLoss_25;
        int weightLoss_V2 =(7 * 1000)/weightLoss_50;
        System.out.println("According to the first type " + weightLoss_V1 + " weight loss days");
        System.out.println("According to the second type " + weightLoss_V2 + " weight loss days");


        //Задание 5.
        // сотрудники, работающие дольше 3 лет, получают повышение зарплаты раз в год на 10 % от текущей зарплаты.
        //Автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //Машае 67 760 * 0,1 рублей в месяц
        //Денису 83 690 * 0,1 рублей в месяц
        //Кристинае 76 230 * 0,1 рублей в месяц
        //посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        // Посчитайте, сколько будет получать каждый из сотрудников,
        // а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        //Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.

        int MahaWorks = 4, DenisWorks = 5, KrisWorks = 6;
        boolean MashaExperience = MahaWorks > 3,DenisExperience = DenisWorks > 3,KrisExperience = KrisWorks > 3;
        System.out.println ("Experience more than 3 years : " + MashaExperience + DenisExperience + KrisExperience);
       //проверка стажа работы

        int MahaZp = 67760, DenisZp = 83690, KrisZp = 76230;
        double apZp = 0.1;
        double M = apZp * MahaZp + MahaZp, D = apZp * DenisZp + DenisZp, K = apZp*KrisZp+KrisZp;
        System.out.println ("ZP Maha in next month "+ M + " ru" + " annual salary " + M * 12 +" ru" );
        System.out.println ("ZP Denis in next month " + D + " ru" + " annual salary " + D * 12 +" ru");
        System.out.println ("ZP Kris in next month " + K + " ru" + " annual salary " + K * 12 +" ru");






    }
}
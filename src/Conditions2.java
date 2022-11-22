public class Conditions2 {
    public static void main(String[] args) {

        //Задача1
        System.out.println("Задача 1");

        int clientOS = 1; //iOs = 0, android = 1

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача2
        System.out.println("Задача 2");

        int clientOS2 = 0; //iOs = 0, android = 1
        int clientDeviceYear = 2014;  //2014 и ранее - облегченная версия, 2015 и позже - обычная

        if (clientOS2 == 0) {
            if (clientDeviceYear>=2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else if (clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            }
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Задача3
        System.out.println("Задача 3");

        int fourYearPeriod = 0;
        int fourHundredYearPeriod = 0;
        int year = 2021;

        for (fourYearPeriod = 0; fourYearPeriod<3000; fourYearPeriod = fourYearPeriod+4){
            if (year == fourYearPeriod) {
                System.out.println("Проверка на 4-х летний период пройдена успешно");
                break;
            }
            }
        for (fourHundredYearPeriod=0; fourHundredYearPeriod<3000; fourHundredYearPeriod=fourHundredYearPeriod+400){
            if (year == fourHundredYearPeriod) {
                System.out.println("Проверка на 400-летний период пройдена успешно");
                break;
            }

        }
        boolean viscosityYear = year == fourYearPeriod || year == fourHundredYearPeriod;
        if (viscosityYear) {
            System.out.println("Это високосный год");
        }
        else {
            System.out.println("Это обычный год");
        }

        //Задача4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryCircle = 40;
        int deliveryDays = 1 + (deliveryDistance + 20)/deliveryCircle; // +1 день в начале формулы - это первый день если доставка происходит в радиусе 20 км

        System.out.println("Если дистанция до клиента составит " + deliveryDistance + " км, то время доставки карты составит " + deliveryDays + " дня");

        //Задача5
        System.out.println("Задача 5");

        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:

                System.out.println("Время года зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года осень");
                break;
            default:
                System.out.println("Такого месяца нет");

        }


    }
}
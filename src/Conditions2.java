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

    }
}
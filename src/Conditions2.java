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

    }
}
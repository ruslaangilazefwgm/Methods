public class Main {
    public static void Task1(int UserYear) {
        if (UserYear % 4 == 0 && UserYear % 100 != 0 || UserYear % 400 == 0) {
            System.out.println(UserYear + " - Год високосный");
        }
        else if (UserYear % 4 != 0 || UserYear % 100 == 0) {
            System.out.println(UserYear + " - Год не високосный");
        }
    }

    public static void Task2(int OS, int currentYear) {
            if (OS == 0 && currentYear >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (OS == 0 && currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

            if (OS == 1 && currentYear >= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else if (OS == 1 && currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

    }
    public static int Task3( int distance) {
        if (distance < 20) {
            return 1;
        } else {
            return (int) Math.round((double) distance / 40) + 1;
        }
    }
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2021;
        Task1(year);

        // Задача 2
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        Task2(clientOS, clientDeviceYear);

        // Задача 3
        System.out.println("Задача 3");
        int deliveryDays = Task3(60);
        System.out.println("Потребуется дней: " + deliveryDays);

    }
}
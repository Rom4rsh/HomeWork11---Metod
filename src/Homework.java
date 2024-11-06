public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void calculationYear(int year) {
        if (year > 0 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задание 1");
        int year = 2021;
        calculationYear(year);
    }

    public static void chooseOs(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void task2() {
        System.out.println("Задание 2");

        chooseOs(0, 2014);
    }

    public static String checkDistance(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 0) {
            return "Введите корректную дистанцию";
        }
        if (deliveryDistance <= 20) {
            days = days + 1;
        } else if (deliveryDistance <= 60) {
            days = days + 2;
        } else if (deliveryDistance <= 100) {
            days = days + 3;
        }
        if (deliveryDistance > 100) {
            return "Доставки нет";
        }
        return "Потребуеться дней доставки - " + days;
    }

    public static void task3() {
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        System.out.println(checkDistance(deliveryDistance));
    }
}
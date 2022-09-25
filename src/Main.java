import java.util.Scanner;

class Homework {
    public static void main(String[] args) {
        printYear();
        localDate();
        task3();
    }

    public static void printYear() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 || year % 100 != 0) && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void localDate(){
        Scanner sc = new Scanner(System.in);
        int clientIos = sc.nextInt();
        int clientDeviceYear = sc.nextInt();
        if (clientIos == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int deliveryDistance = sc.nextInt();
        int dayOfDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + dayOfDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + (dayOfDelivery + 1));
        } else {
            System.out.println("Потребуется дней: " + (dayOfDelivery + 2));
        }
    }
}

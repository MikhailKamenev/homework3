import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение для обоих вариантов.
        //Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.

        int clientOs = 0;
        int clientDeviceYear = 2014;
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Напишите программу, которая определяет, является ли год високосным или нет.
        int year = 442;
        int vYear = year % 4;
        if (vYear == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }


        // определение времени доставки банковской карты до клиента

        int deliveryDistance = 55;
        if (deliveryDistance <= 20) {
            System.out.println("Время доставки - 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Время доставки - 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Время доставки - 3 дня");
        }

        //Напишите программу, которая определяет к какому сезону принадлежит месяц
        int month = 15;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Выбранный месяц - зимний!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Выбранный месяц - весенний!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Выбранный месяц - летний!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Выбранный месяц - осенний!");
                break;
            default:
                System.out.println("Месяцев всего 12, если ты не гуманоид с другой планеты.");
        }
    }
}
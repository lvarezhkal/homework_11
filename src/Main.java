public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        int deliveryDistance = 79;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        printDeliveryDays(deliveryDays);
    }
    public static boolean leapYear(int yearCheck) {
        if ((yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0)
            return true;
        else
            return false;
    }
    //1
    public static void task1() {
        int year = 2000;
        boolean isLeapYear = leapYear(year);
        if (isLeapYear)
            System.out.println(year + " год является високосным.");
        else
            System.out.println(year + "год не является високосным.");
    }
    public static void getClient(String os, int year) {
        int testYear = 2015;
        if (os.equalsIgnoreCase("ios") && year <= testYear) {
            System.out.println("Установите облегченную версию для IOS");
        } else if (os.equalsIgnoreCase("ios") && year > testYear) {
            System.out.println("Установите приложение для IOS");
        } else if (os.equalsIgnoreCase("android") && year <= testYear) {
            System.out.println("Установите облегченную версию для Android");
        } else {
            System.out.println("Установите приложение для Android");
        }
    }
    //2
    public static void task2() {
        int clientDeviceYear = 2022;
        String osName = "ios";
        getClient(osName, clientDeviceYear);
    }
    public static int calculateDeliveryDays(int distance) {
        int result = 1;
        if (distance > 20) {
            result++;
        }
        if (distance > 60) {
            result++;
        }
        if (distance > 100) {
            result = -1;
        }
        return result;
    }
    //3
    public static void printDeliveryDays(int deliveryDays) {
        if (deliveryDays < 1) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}
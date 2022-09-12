public class Main {

    // задание 1
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static class Main2 {

        // задание 2
        public static void main(String[] args) {
            task2();
        }

        public static void task2() {
            int clientOS = 0;
            int clientDeviceYear = 2020;

            if (clientOS == 0) {
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
    }


    public static class Main3 {

        // задание 3
        public static void main(String[] args) {
            task3();
        }

        public static void task3() {
            int year = 2020;

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "являеться высокостным");
            } else {
                System.out.println(year + "являеться не высокостным");
            }
        }
    }

    public static class Main4 {

        // задание 4
        public static void main(String[] args) {
            task4();
        }


        public static void task4() {
            int diliveryDistance = 95;

            int deliveryDays = 1;

                    if (diliveryDistance > 20) {
                        deliveryDays++;
                    }
                    if (diliveryDistance > 60) {
                        deliveryDays++;
                    }
                    System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}


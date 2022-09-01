public class Main {

    // задание 1
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        int clientOs = 1;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}



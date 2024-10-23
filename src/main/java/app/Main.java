package app;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Первое сообщение логирования");

        Logger logger2 = Logger.getInstance();
        logger2.log("Второе сообщение логирования");

        if (logger1 == logger2) {
            System.out.println("Logger1 и Logger2 - это один и тот же экземпляр");
        } else {
            System.out.println("Logger1 и Logger2 - это разные экземпляры");
        }
    }
}
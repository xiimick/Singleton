package app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTest {

    @Test
    public void testSingletonInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Перевіряємо, що обидва посилання вказують на один і той же об'єкт
        assertSame(logger1, logger2, "Logger instances should be the same");
    }

    @Test
    public void testLogMethod() {
        Logger logger = Logger.getInstance();
        logger.log("Testing log message");

        // Тут можна перевірити вивід через перехоплення стандартного потоку виводу,
        // але для простоти просто переконаємось, що метод не викликає винятків.
        assertDoesNotThrow(() -> logger.log("Another log message"));
    }
}

package app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMainMethod() {
        // Ми можемо просто викликати метод main і переконатися, що він не викликає винятків
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test
    public void testLoggerEqualityInMain() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Перевіряємо, що logger1 і logger2 є одним і тим же екземпляром
        assertSame(logger1, logger2, "Logger instances in Main should be the same");
    }
}

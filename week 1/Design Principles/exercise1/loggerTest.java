public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        logger1.log("This is a test message.");
        
        if (logger1 == logger2) {
            System.out.println("Logger instances are the same.");
        }
    }
}

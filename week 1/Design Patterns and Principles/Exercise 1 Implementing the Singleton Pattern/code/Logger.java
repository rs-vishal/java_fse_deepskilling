public class Logger {

    //Private static instance of Logger (Eager Initialization)
    private  static Logger instance = new Logger();

    private Logger() {
        System.out.println("Logger initialized");
    }


    //Public static method to provide access to the instance
    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;

    }


    //log method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    
}

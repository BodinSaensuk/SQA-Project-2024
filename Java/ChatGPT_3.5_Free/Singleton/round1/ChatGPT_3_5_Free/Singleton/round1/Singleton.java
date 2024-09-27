package ChatGPT_3_5_Free.Singleton.round1;

public class Singleton {
    // Static variable to hold the single instance of Singleton
    private static Singleton instance;
    
    // Private constructor to prevent instantiation
    private Singleton() {
        // private to prevent instantiation
    }
    
    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Example method to demonstrate functionality
    public String getSingletonData() {
        return "Singleton Data";
    }
}

package GeminiFlash.Singleton.round1;

public class GeminiF_R1_Singleton {
    private static GeminiF_R1_Singleton instance;

    private GeminiF_R1_Singleton() {
        // Private constructor to prevent direct instantiation
    }

    public static GeminiF_R1_Singleton getInstance() {
        if (instance == null) 
 {
            synchronized (GeminiF_R1_Singleton.class) {
                if (instance == null) {
                    instance = new GeminiF_R1_Singleton();
                }
            }
        }
        return instance;
    }

    // Methods for the singleton's functionality
    public void doSomething() {
        // ...
    }
}
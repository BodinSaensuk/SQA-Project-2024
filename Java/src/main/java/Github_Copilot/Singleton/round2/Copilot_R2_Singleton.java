package Github_Copilot.Singleton.round2;

public class Copilot_R2_Singleton {
    private static Copilot_R2_Singleton instance;

    private Copilot_R2_Singleton() {
        // private constructor to prevent instantiation
    }

    public static Copilot_R2_Singleton getInstance() {
        if (instance == null) {
            instance = new Copilot_R2_Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return "Hello from Singleton!";
    }
}


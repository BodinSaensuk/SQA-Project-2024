package Github_Copilot.Singleton.round3;

public class Copilot_R3_Singleton {
    private static Copilot_R3_Singleton instance;

    private Copilot_R3_Singleton() {
        // private constructor to prevent instantiation
    }

    public static Copilot_R3_Singleton getInstance() {
        if (instance == null) {
            instance = new Copilot_R3_Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return "Hello, Singleton!";
    }

    public void doSomething() {
        System.out.println("Doing something in Singleton");
    }
}


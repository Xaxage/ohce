package main;

public class Main {
    private final CoreLogic coreLogic;

    public Main() {
        coreLogic = new CoreLogic();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getMainLogic().startApplication();
    }

    public CoreLogic getMainLogic() {
        return coreLogic;
    }
}

package main;

import console.Console;
import console.ConsoleImpl;
import input_utils.InputUtils;
import input_utils.InputUtilsImpl;

public class CoreLogic {
    private final Console console;
    private final InputUtils inputUtils;

    public CoreLogic() {
        console = new ConsoleImpl();
        inputUtils = new InputUtilsImpl();
    }

    public void startApplication() {
        String name;
        String input = console.readConsoleLine();

        if (input.contains("ohce")) {
            name = input.split(" ")[1];
            console.outputConsoleLine(inputUtils.greetingMessage() + name + "!");
        } else {
            console.outputConsoleLine("Input didn't contain 'ohce'. Closing ");
            return;
        }

        while (true) {
            input = console.readConsoleLine();

            if (input.equals("Stop!")) {
                console.outputConsoleLine("Adios " + name);
                break;
            }
            console.outputConsoleLine(inputUtils.getReverse(input));
        }
    }
}

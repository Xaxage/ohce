package console;

import java.util.Scanner;

public class ConsoleImpl implements Console {
    private final Scanner scanner;

    public ConsoleImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readConsoleLine() {
        return scanner.nextLine();
    }

    @Override
    public void outputConsoleLine(String lineToPrint) {
        System.out.println(lineToPrint);
    }
}

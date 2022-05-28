package input_utils;

import clock.Clock;
import clock.ClockImpl;
import main.DayTime;

public class InputUtilsImpl implements InputUtils {
    private final Clock clock;

    public InputUtilsImpl() {
        clock = new ClockImpl();
    }

    public String greetingMessage() {
        if (clock.getClockUtils().isBetween(6, 12, this.clock)) {
            return DayTime.DIAS.getGreeting();
        } else if (clock.getClockUtils().isBetween(12, 20, this.clock)) {
            return DayTime.TARDES.getGreeting();
        } else {
            return DayTime.NOCHES.getGreeting();
        }
    }


    public String getReverse(String input) {
        StringBuilder reversed = new StringBuilder(input).reverse();
        if (reversed.toString().equals(input)) {
            reversed.append("\n¡Bonita palabra!");
        }
        return reversed.toString();
    }
}

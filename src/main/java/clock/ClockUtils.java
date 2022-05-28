package clock;

public class ClockUtils {

    public boolean isBetween(int start, int end, Clock clock) {
        int hour = clock.getCurrentHour();
        return hour >= start && hour < end;
    }
}

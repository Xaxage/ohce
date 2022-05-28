package clock;

import java.util.Calendar;

public class ClockImpl implements Clock {
    private final ClockUtils clockUtils;

    public ClockImpl() {
        clockUtils = new ClockUtils();
    }

    @Override
    public int getCurrentHour() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.HOUR_OF_DAY);
    }

    public ClockUtils getClockUtils() {
        return clockUtils;
    }
}
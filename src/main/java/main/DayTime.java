package main;

public enum DayTime {
    NOCHES("¡Buenas noches "),
    DIAS("¡Buenas dias "),
    TARDES("¡Buenas tardes ");

    DayTime(String greeting) {
        this.greeting = greeting;
    }

    private final String greeting;

    public String getGreeting() {
        return greeting;
    }
}
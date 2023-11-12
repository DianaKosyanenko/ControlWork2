public enum Command {
     GO("Идти"),

    STOP("Остановиться"),

    RUN_AWAY("Убегать"),

    COME_UP("Подходить"),

    LIE("Лежать"),

    JUMP("Прыгать"),

    STAND_UP("Встать"),

    SIT_DOWN("Садиться");

    private String commandName;

    Command(String commandName) {
        this.commandName = commandName;
    }

    @Override
    public String toString() {
        return "Умеет" + commandName;
    }

    public static Command[] getDomesticComands() {
        return new Command[]{GO, STAND_UP, JUMP, COME_UP, STOP, SIT_DOWN};
    }

    public static Command[] getPackComands() {
        return new Command[]{GO, STAND_UP, STOP, RUN_AWAY, LIE};
    }
}

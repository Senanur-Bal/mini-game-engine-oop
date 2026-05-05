public class LoggerAdapter extends GameObject {
    private LegacyLogger legacyLogger;

    public LoggerAdapter(LegacyLogger logger) {
        this.legacyLogger = logger;
    }

    @Override
    public void update() {
        legacyLogger.logMessage("Logger Adapter is updating...");
    }
}
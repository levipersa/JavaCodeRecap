package fundamentals.coderecap.designPatterns;

public abstract class Notification {
    public abstract String getMessage();

    public void sendNotification(NotificationStrategy strategy) {
        strategy.sendMessage(getMessage());
    }
}

package fundamentals.coderecap.designPatterns;

public class SMSNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent to SMS"+message);
    }
}

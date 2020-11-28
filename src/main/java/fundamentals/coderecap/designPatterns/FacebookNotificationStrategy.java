package fundamentals.coderecap.designPatterns;

public class FacebookNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendMessage(String message) {
        System.out.println("MEssage sent to Facebook"+message);
    }
}

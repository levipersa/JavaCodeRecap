package fundamentals.coderecap.designPatterns;

public class SmokeNotification extends Notification {
    Integer notificationDetails;

    public SmokeNotification(Integer notificationDetails) {
        this.notificationDetails = notificationDetails;
    }

    @Override
    public String getMessage() {
        return "We have volume difference of"+ notificationDetails;
    }
}

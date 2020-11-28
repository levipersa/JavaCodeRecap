package fundamentals.coderecap.designPatterns;

public class MotionNotification extends Notification {
    Integer notificationDetails;

    public MotionNotification(Integer notificationDetails) {
        this.notificationDetails = notificationDetails;
    }

    @Override
    public String getMessage() {
        return "We have distance difference of"+notificationDetails;
    }
}

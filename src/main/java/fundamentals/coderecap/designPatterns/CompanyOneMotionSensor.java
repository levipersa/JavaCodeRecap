package fundamentals.coderecap.designPatterns;

public class CompanyOneMotionSensor extends MotionSensor implements Observer {

    private Integer newDistance;
    private Subject subject;

    public CompanyOneMotionSensor(Integer distance, String description) {
        super(distance, description);
    }

    public CompanyOneMotionSensor(Integer distance) {
        super(distance);
    }

    public Integer getNewDistance() {
        return newDistance;
    }

    public void setNewDistance(Integer newDistance) {
        this.newDistance = newDistance;
    }

    @Override
    public void detect() {
        if (this.newDistance < super.getDistance()) {
            System.out.println("Motion detected!");
            MotionNotification notification =
                    new MotionNotification(super.getDistance()-newDistance);
            notification.sendNotification(new FacebookNotificationStrategy());
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

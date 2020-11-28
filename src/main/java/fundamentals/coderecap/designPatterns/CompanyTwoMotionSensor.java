package fundamentals.coderecap.designPatterns;

public class CompanyTwoMotionSensor extends MotionSensor implements Observer {

    private Integer newDistance;
    private Subject subject;

    public CompanyTwoMotionSensor(Integer distance, String description) {
        super(distance, description);
    }
    public CompanyTwoMotionSensor(Integer distance) {
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
        if (this.newDistance < super.getDistance()){
            System.out.println("Motion detected! CompanyTwo Sensor...");
            MotionNotification notification =
                    new MotionNotification(super.getDistance()-newDistance);
            notification.sendNotification(new SMSNotificationStrategy());
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

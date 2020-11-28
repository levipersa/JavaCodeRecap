package fundamentals.coderecap.designPatterns;

public class CompanyTwoSmokeSensor extends SmokeSensor implements Observer {

    private Integer newVolume;
    private Subject subject;

    public CompanyTwoSmokeSensor(Integer volume) {
        super(volume);
    }

    public Integer getNewVolume() {
        return newVolume;
    }

    public void setNewVolume(Integer newVolume) {
        this.newVolume = newVolume;
    }

    @Override
    public void detect() {
        if (this.newVolume < super.getVolume()) {
            System.out.println("Smoke detected! CompanyTwo Sensor...");
            SmokeNotification notification =
                    new SmokeNotification(super.getVolume()-newVolume);
            notification.sendNotification(new FacebookNotificationStrategy());
            HomeController homeController=new HomeController();
            homeController.setCommand(new TurnOnSprinklerCommand(new WaterSprinkler()));
            homeController.buttonPressed();
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

package fundamentals.coderecap.designPatterns;

public class CompanyOneSmokeSensor extends SmokeSensor implements Observer {

    private Integer newVolume;
    private Subject subject;


    public CompanyOneSmokeSensor(Integer volume) {
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
            System.out.println("Smoke detected!");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

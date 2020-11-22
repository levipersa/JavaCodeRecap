package fundamentals.coderecap.designPatterns;

public class CompanyOneSmokeSensor extends SmokeSensor {

    Integer newVolume;

    public CompanyOneSmokeSensor(Integer volume) {
        super(volume);
    }

    public Integer getNewVolume() {
        return newVolume;
    }

    public void setNewVolume(Integer newVolume) {
        this.newVolume = newVolume;
    }
}

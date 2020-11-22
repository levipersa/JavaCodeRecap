package fundamentals.coderecap.designPatterns;

public class CompanyTwoSmokeSensor extends SmokeSensor{
    Integer newVolume;

    public CompanyTwoSmokeSensor(Integer volume) {
        super(volume);
    }

    public Integer getNewVolume() {
        return newVolume;
    }

    public void setNewVolume(Integer newVolume) {
        this.newVolume = newVolume;
    }
}

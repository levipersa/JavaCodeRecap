package fundamentals.coderecap.designPatterns;

public class SmokeSensor extends Sensor {
    Integer volume;

    public SmokeSensor(Integer volume) {
        super();
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}

package fundamentals.coderecap.designPatterns;

public class MotionSensor extends Sensor {
    Integer distance;

    public MotionSensor(Integer distance, String description) {
        this.distance = distance;
        this.description = description;
    }

    public MotionSensor(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer newDistance) {
        this.distance = newDistance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

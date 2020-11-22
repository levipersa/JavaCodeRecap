package fundamentals.coderecap.designPatterns;

public class CompanyOneMotionSensor extends MotionSensor {

    Integer newDistance;

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
}

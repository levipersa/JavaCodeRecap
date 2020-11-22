package fundamentals.coderecap.designPatterns;

public class CompanyTwoMotionSensor extends MotionSensor{

    Integer newDistance;

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
}

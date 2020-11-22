package fundamentals.coderecap.designPatterns;

public class CompanyTwoFactory implements SensorAbstractFactory {

    @Override
    public MotionSensor createMotionSensor(Integer distance) {
        return new CompanyTwoMotionSensor(distance);
    }

    @Override
    public SmokeSensor createSmnokeSensor(Integer volume) {
        return new CompanyTwoSmokeSensor(volume);
    }
}

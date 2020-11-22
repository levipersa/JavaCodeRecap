package fundamentals.coderecap.designPatterns;

public class CompanyOneFactory implements SensorAbstractFactory {

    @Override
    public MotionSensor createMotionSensor(Integer distance) {
        return new CompanyOneMotionSensor(distance);
    }

    @Override
    public SmokeSensor createSmnokeSensor(Integer volume) {
        return new CompanyOneSmokeSensor(volume);
    }
}

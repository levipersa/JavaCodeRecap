package fundamentals.coderecap.designPatterns;

public interface SensorAbstractFactory {

    MotionSensor createMotionSensor(Integer distance);
    SmokeSensor createSmnokeSensor(Integer volume);
}

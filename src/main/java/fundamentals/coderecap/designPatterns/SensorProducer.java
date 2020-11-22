package fundamentals.coderecap.designPatterns;

public class SensorProducer {
    public static Sensor createSensor(String details,Integer parameter){
        switch (details){
            case "CompanyOneSmokeSensor":
                return new CompanyOneFactory().createSmnokeSensor(parameter);
            case "CompanyOneMotionSensor":
                return new CompanyOneFactory().createMotionSensor(parameter);
            case "CompanyTwoSmokeSensor":
                return new CompanyTwoFactory().createSmnokeSensor(parameter);
            case "CompanyTwoMotionSensor":
                return new CompanyTwoFactory().createMotionSensor(parameter);
            default:
                return null;
        }

    }
}

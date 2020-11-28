package fundamentals.coderecap.designPatterns;

public class HouseApp {
    public static void main(String[] args) {

        CompanyOneSmokeSensor smokeSensor = (CompanyOneSmokeSensor) SensorProducer.createSensor("CompanyOneSmokeSensor", 10);
        CompanyTwoMotionSensor motionSensor = (CompanyTwoMotionSensor) SensorProducer.createSensor("CompanyTwoMotionSensor", 15);

        Subject sensorSystem = new SensorSystem();
        sensorSystem.register(smokeSensor);
        sensorSystem.register(motionSensor);
        motionSensor.setSubject(sensorSystem);
        smokeSensor.setSubject(sensorSystem);

        smokeSensor.setNewVolume(4);
        motionSensor.setNewDistance(12);

        sensorSystem.notifyObservers();
//        smokeSensor.detect();
        sensorSystem.unRegister(smokeSensor);
        sensorSystem.notifyObservers();
        HomeController homeController = new HomeController();
        homeController.setCommand(new TurnOffSprinklerCommand(new WaterSprinkler()));
        homeController.buttonPressed();
        homeController.setCommand(new StopAlarmCommand(new AlarmForMotion()));
        homeController.buttonPressed();


    }
}

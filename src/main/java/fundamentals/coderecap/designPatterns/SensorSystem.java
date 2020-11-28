package fundamentals.coderecap.designPatterns;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem implements Subject {

    private List<Observer> sensorList;

    public SensorSystem() {
        this.sensorList = new ArrayList<>();
    }

    public List<Observer> getSensorList() {
        return sensorList;
    }

    public void setSensorList(List<Observer> sensorList) {
        this.sensorList = sensorList;
    }

    @Override
    public void register(Observer observer) {
        this.sensorList.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        this.sensorList.remove(observer);
    }

    @Override
    public void notifyObservers() {

        sensorList.forEach(Observer::detect);

    }
}

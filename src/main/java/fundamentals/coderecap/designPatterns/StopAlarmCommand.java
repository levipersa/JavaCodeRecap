package fundamentals.coderecap.designPatterns;

public class StopAlarmCommand implements Command {
    AlarmForMotion alarm;

    public StopAlarmCommand(AlarmForMotion alarmForMotion) {
        this.alarm=alarmForMotion;
    }

    @Override
    public void execute() {
        alarm.stop();

    }
}

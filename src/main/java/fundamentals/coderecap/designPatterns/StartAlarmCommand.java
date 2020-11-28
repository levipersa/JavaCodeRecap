package fundamentals.coderecap.designPatterns;

public class StartAlarmCommand implements Command {
    AlarmForMotion alarm;

    public StartAlarmCommand(AlarmForMotion alarmForMotion) {
        this.alarm=alarmForMotion;
    }

    @Override
    public void execute() {
        alarm.start();

    }
}

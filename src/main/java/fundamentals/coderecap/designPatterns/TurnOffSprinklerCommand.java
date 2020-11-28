package fundamentals.coderecap.designPatterns;

public class TurnOffSprinklerCommand implements Command {
   WaterSprinkler sprinkler;

    public TurnOffSprinklerCommand(WaterSprinkler waterSprinkler) {
        this.sprinkler=waterSprinkler;
    }

    @Override
    public void execute() {
        sprinkler.turnOff();

    }
}

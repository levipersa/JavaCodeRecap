package fundamentals.coderecap.designPatterns;

public class TurnOnSprinklerCommand implements Command {
    WaterSprinkler sprinkler;

    public TurnOnSprinklerCommand(WaterSprinkler sprinkler) {
        super();
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.turnOn();

    }
}

package fundamentals.coderecap.designPatterns;

public class HomeController {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonPressed(){
        command.execute();
    }
}

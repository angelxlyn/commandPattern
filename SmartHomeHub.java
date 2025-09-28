package commandPattern;

public class SmartHomeHub {
    private Command command;
    
    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void pressButton() {
        command.execute();
    }
}

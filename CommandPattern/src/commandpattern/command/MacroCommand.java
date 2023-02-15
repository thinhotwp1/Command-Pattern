package commandpattern.command;


public class MacroCommand implements Command{

    private int combo = 2; // 2 hành động 1 lúc

    Command[] commands = new Command[combo];

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void excuteOn() {
        for(Command command:commands){
            command.excuteOn();
        }
    }

    @Override
    public void excuteOff() {
        for(Command command:commands){
            command.excuteOff();
        }
    }

    @Override
    public void undo() {
        for(Command command:commands){
            command.undo();
        }
    }
}

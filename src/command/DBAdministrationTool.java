package command;

public class DBAdministrationTool {
    Command[] dbCommands;
    Command undoCommand;

    public DBAdministrationTool(Command[] dbCommands) {
        this.dbCommands = new Command[3];
        for (int i = 0; i < dbCommands.length; i++) {
            this.dbCommands[i] = dbCommands[i];
        }
    }

    public void buttonWasPressed(int buttonIndex) {
        this.dbCommands[buttonIndex - 1].execute();
        undoCommand = this.dbCommands[buttonIndex - 1];
    }

    public void revert() {
        undoCommand.undo();
    }
}

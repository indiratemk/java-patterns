package command;

public class SelectRecordsCommand implements Command {
    private Table table;

    public SelectRecordsCommand(Table table) {
        this.table = table;
    }

    @Override
    public void execute() {
        System.out.println("Showing all records from table");
        table.showRecords();
    }

    @Override
    public void undo() {
        System.out.println("Can not do undo");
    }
}

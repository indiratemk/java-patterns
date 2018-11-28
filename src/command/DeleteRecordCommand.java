package command;

public class DeleteRecordCommand implements Command {
    private Table table;

    public DeleteRecordCommand(Table table) {
        this.table = table;
    }

    @Override
    public void execute() {
        table.deleteRecord();
        System.out.println("Deleting record from table...");
        table.showRecords();

    }

    @Override
    public void undo() {
        System.out.println("Unset deleting...");
        table.addRecord(table.getId());
        table.showRecords();
    }


}

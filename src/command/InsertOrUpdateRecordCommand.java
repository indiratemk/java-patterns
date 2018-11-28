package command;

public class InsertOrUpdateRecordCommand implements Command {
    private Table table;

    public InsertOrUpdateRecordCommand(Table table) {
        this.table = table;
    }

    @Override
    public void execute() {
        table.addRecord();
        System.out.println("Record inserting into table...");
        table.showRecords();
    }

    @Override
    public void undo() {
        System.out.println("Unset inserting...");
        table.deleteRecord(table.getId());
        table.showRecords();
    }
}

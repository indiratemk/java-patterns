package command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Map<Integer, String> cityTable = new HashMap<>();
        cityTable.put(1, "Almaty");
        cityTable.put(2, "Astana");
        cityTable.put(3, "Karaganda");

        Table table = new Table(cityTable);

        Command[] commands = {new SelectRecordsCommand(table),
                              new InsertOrUpdateRecordCommand(table),
                              new DeleteRecordCommand(table)};

        DBAdministrationTool dbTool = new DBAdministrationTool(commands);

        showCommandsList();

        while (true) {
            Scanner sc = new Scanner(System.in);
            int buttonNumber = sc.nextInt();
            if(buttonNumber == 4) {
                dbTool.revert();
            } else {
                dbTool.buttonWasPressed(buttonNumber);
            }
        }

    }


    public static void showCommandsList() {
        System.out.println("1. Selecting records from table");
        System.out.println("2. Inserting records into table");
        System.out.println("3. Deleting records from table");
        System.out.println("4. Revert");
    }
}

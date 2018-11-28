package command;

import java.util.Map;
import java.util.Scanner;

public class Table {
    private int id;
    private String title;
    Map<Integer, String> records;
    public Scanner sc = new Scanner(System.in);


    public Table(Map<Integer, String> records) {
        this.records = records;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addRecord() {
        System.out.println("Enter inserting values: ");
        this.id = sc.nextInt();
        this.title = sc.next();
        records.put(id, title);
    }

    public void addRecord(int id) {
        records.put(id, title);
    }

    public void showRecords() {
        for (Map.Entry<Integer, String> record : records.entrySet()) {
            System.out.println(record.getKey() + " | " + record.getValue());
        }
    }

    public void deleteRecord() {
        System.out.println("Enter id of deleting record: ");
        this.id = sc.nextInt();
        this.title = records.get(id);
        records.remove(id);
    }

    public void deleteRecord(int id) {
        records.remove(id);
    }

}

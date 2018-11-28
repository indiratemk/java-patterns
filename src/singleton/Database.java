package singleton;

public class Database {
    private static Database database = null;
    private String name;

    private Database() {

    }

    public static Database getInstance() {
        if(database == null) {
            database = new Database();

        }
        return database;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package singleton;

public class Test {
    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        database1.setName("Employees");
        System.out.println(database1);
        Database database2 = Database.getInstance();
        System.out.println(database2);

        System.out.println(database1.getName());
        System.out.println(database2.getName());
    }
}

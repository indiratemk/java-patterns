package decorator;

public class BeautySalon {
    public static void main(String[] args) {
        Manicure manicure = new GelManicure();
        manicure = new French(manicure);
        manicure = new Rhinestone(manicure);
        System.out.println("Total price: " + manicure.getPrice() + " tenge");
        System.out.println("Total time: " + manicure.getTime() + " minutes");
        System.out.println("Description: " + manicure.getName());
    }
}

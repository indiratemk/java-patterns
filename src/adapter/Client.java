package adapter;

public class Client {
    public static void main(String[] args) {
        Payment cash = new CashPayment();
        cash.makePayment();
        CardTransfer cardTransfer = new CardTransfer();
        Payment card = new CardTransferAdapter(cardTransfer);
        card.makePayment();
    }
}

package adapter;

public class CardTransferAdapter implements Payment {
    private CardTransfer cardTransfer;

    public CardTransferAdapter(CardTransfer cardTransfer) {
        this.cardTransfer = cardTransfer;
    }

    @Override
    public void makePayment() {
        cardTransfer.withdrawMoney();
    }
}

public class Transaction {
    private String type;
    private String stockName;
    private int quantity;

    public Transaction(String type, String stockName, int quantity) {
        this.type = type;
        this.stockName = stockName;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println(type + " " + quantity + " shares of " + stockName);
    }
}
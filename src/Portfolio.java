import java.util.*;

public class Portfolio {
    private double balance = 10000;
    private HashMap<String, Integer> holdings = new HashMap<>();
    private ArrayList<Transaction> history = new ArrayList<>();

    public void buyStock(Stock stock, int qty) {
        double cost = stock.getPrice() * qty;

        if (balance >= cost) {
            balance -= cost;
            holdings.put(stock.getName(),
                    holdings.getOrDefault(stock.getName(), 0) + qty);

            history.add(new Transaction("Bought", stock.getName(), qty));
            System.out.println("Stock Purchased Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void sellStock(Stock stock, int qty) {
        int owned = holdings.getOrDefault(stock.getName(), 0);

        if (owned >= qty) {
            balance += stock.getPrice() * qty;
            holdings.put(stock.getName(), owned - qty);

            history.add(new Transaction("Sold", stock.getName(), qty));
            System.out.println("Stock Sold Successfully.");
        } else {
            System.out.println("Not enough shares.");
        }
    }

    public void displayPortfolio() {
        System.out.println("\n------ Portfolio ------");
        System.out.println("Balance : $" + balance);

        for (String stock : holdings.keySet()) {
            System.out.println(stock + " : " + holdings.get(stock) + " shares");
        }
    }

    public void displayTransactions() {
        System.out.println("\nTransaction History");
        for (Transaction t : history) {
            t.display();
        }
    }
}
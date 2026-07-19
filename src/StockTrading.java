import java.util.*;

public class StockTrading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock apple = new Stock("Apple", 150);
        Stock tesla = new Stock("Tesla", 250);
        Stock google = new Stock("Google", 180);

        Portfolio user = new Portfolio();

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. Display Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Stocks");
                    System.out.println("1. Apple  : $" + apple.getPrice());
                    System.out.println("2. Tesla  : $" + tesla.getPrice());
                    System.out.println("3. Google : $" + google.getPrice());
                    break;

                case 2:
                    System.out.println("Choose Stock (1-Apple 2-Tesla 3-Google): ");
                    int b = sc.nextInt();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    if (b == 1)
                        user.buyStock(apple, qty);
                    else if (b == 2)
                        user.buyStock(tesla, qty);
                    else if (b == 3)
                        user.buyStock(google, qty);
                    else
                        System.out.println("Invalid Choice");
                    break;

                case 3:
                    System.out.println("Choose Stock (1-Apple 2-Tesla 3-Google): ");
                    int s = sc.nextInt();

                    System.out.print("Quantity: ");
                    int q = sc.nextInt();

                    if (s == 1)
                        user.sellStock(apple, q);
                    else if (s == 2)
                        user.sellStock(tesla, q);
                    else if (s == 3)
                        user.sellStock(google, q);
                    else
                        System.out.println("Invalid Choice");
                    break;

                case 4:
                    user.displayPortfolio();
                    break;

                case 5:
                    user.displayTransactions();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
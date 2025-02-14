package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 12S23006 - Cardolan Sinaga
 * 12S23051 - Theresia Silaban
 */
public class Driver2 {
    private static Map<String, Account> accounts = new HashMap<>();
    private static int transactionCounter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if ("create-account".equals(command)) {
                String owner = scanner.nextLine();
                String accountName = scanner.nextLine();

                Account account = new Account(owner, accountName);
                accounts.put(accountName, account);
                System.out.println(account);
            } else if ("create-transaction".equals(command)) {
                String accountName = scanner.nextLine();
                double amount = Double.parseDouble(scanner.nextLine());
                String postedAt = scanner.nextLine();
                String note = scanner.nextLine();

                Account account = accounts.get(accountName);
                if (account != null) {
                    transactionCounter++;
                    Transaction transaction = new Transaction(accountName, amount, postedAt, note);
                    account.updateBalance(amount);
                    System.out.println(transactionCounter + "|" + transaction + "|" + account.getBalance());
                } else {
                    System.out.println("Account not found");
                }
            } else {
                System.out.println("Invalid command");
            }
        }

        scanner.close();
    }
}
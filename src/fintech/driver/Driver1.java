package fintech.driver;

import fintech.model.Account;
import java.util.Scanner;

/**
 * @author 12S23006 - Cardolan Sinaga
 * @author 12S23051 - Theresia Silaban
 */
public class Driver1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        if ("create-account".equals(command)) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();

            Account account = new Account(owner, accountName);
            System.out.println(account);
        } else {
            System.out.println("Invalid command");
        }
        scanner.close();
    }
}
package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Accounts> accounts = new LinkedList<Accounts>();

        String file = "C:\\Users\\91901\\Downloads\\NewBankAccounts.csv";
        // Read a csv file then create new accounts based on that data

        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equalsIgnoreCase("Savings")) {
                accounts.add(new Savings(name, sSn, initDeposit));
            } else if (accountType.equalsIgnoreCase("Checking")) {
                accounts.add(new Checking(name, sSn, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for (Accounts acc : accounts) {
            System.out.println("\n----------------------------");
            acc.showInfo();

        }
    }
}

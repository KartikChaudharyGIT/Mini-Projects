package BankAccountApp;

public abstract class Accounts implements IRate {
    //List common properties for savings and checking accounts


    private String name;
    private String sSn;
    private double balance;

    private static int index = 10000;

    protected String accountNuumber;
    protected double rate;


    // Constructor to set base properties and initialize the account
    public Accounts(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSn = sSN;
        balance = initDeposit;
        index++;
        // Set account number

        this.accountNuumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoSsn = sSn.substring(sSn.length() - 2, sSn.length());
        int uniqueID = index;
        int randomNumber;
        randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSsn + uniqueID + randomNumber;
    }


    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }
    //List Common Methods - Transactions

    public void deposit(double amount) {
        balance = balance + amount;
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your Balance is now $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNuumber +
                        "\nBALANCE: " + balance +
                        "\nRATE: " + rate + "%"
        );
    }
}

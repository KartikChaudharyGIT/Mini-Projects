package BankAccountApp;

public class Savings extends Accounts {
    // List properties specific to saving account

    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    //Constructor to initialize settings for the savings account
    public Savings(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);
        accountNuumber = "1" + accountNuumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        getSafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }


    // List any methods specific to saving accounts
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");

        super.showInfo();
        System.out.println(
                "Your Savings account features are: " +
                        "\nSafety deposit key: " + getSafetyDepositBoxKey +
                        "\nSafety Deposit ID: " + safetyDepositBoxID
        );
    }
}

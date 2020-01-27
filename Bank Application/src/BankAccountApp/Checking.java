package BankAccountApp;

public class Checking extends Accounts {
    // List properties specific to a checking account

    private int debitCardNumber;
    private int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNuumber = "2" + accountNuumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }


    // List any Methods specific to checking account

    public void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your CHecking account details are: " +
                "\nCARD: " + this.debitCardNumber + "\nPIN: " + this.debitCardPin);
    }
}

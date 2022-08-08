public class CheckingAccount extends Prac_2{
    double overdraft = 5000;
    double overdraftCharge = 0.05;

    public CheckingAccount() {
    }
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double money) {
        if (getBalance() - money < -overdraft) {
            super.withdraw(money);
            setBalance(getBalance()-money*overdraftCharge);
            System.out.println(money*overdraftCharge+"Rs. charge is deducted from your account.");
        }
        else {
            System.out.println("Can't overdraft money more than " + overdraft + " Rs.");
        }
    }
}

public class SavingAccount extends Prac_2{
        public SavingAccount() {}
    
        public SavingAccount(int id, double balance) {
            super(id, balance);
        }
    
        public void withdraw(double money){
            if(money<=getBalance()){
                super.withdraw(money);
            }
            else {
                System.out.println("You don't have sufficient balance to withdraw "+money+" Rs.");
            }
        }
}

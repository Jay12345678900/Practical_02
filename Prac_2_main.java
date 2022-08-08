public class Prac_2_main {
    public static void main(String[] args) {
        Prac_2 ace = new Prac_2();

        System.out.println("Annual Interest: "+ace.getAnnual() + "%");
        System.out.println("Balance: "+ace.getBalance());
        System.out.println("Id: "+ace.getId());
        System.out.println("Date: "+ace.getDate());
        System.out.println("Monthly Interest Rate: "+ace.getMonthlyrate());
        System.out.println("Get Monthly Interest: "+ace.getMonthlyinterest());
        ace.deposit(1000);
        ace.withdraw(1250);

        System.out.println("Made by: 21CE092_Jay\n");
    }
}

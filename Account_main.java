public class Account_main {
    public static void main(String[] args) {
        CheckingAccount CAobject = new CheckingAccount(101,10000);
        SavingAccount SAobject = new SavingAccount(102,7000);
        System.out.println("\nBefore Withdrawing ....\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(CAobject);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(SAobject);

        CAobject.withdraw(16000);
        SAobject.withdraw(7500);
        System.out.println("\nAfter Withdrawing ....\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(CAobject);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(SAobject);

        System.out.println("Made by: 21CE092_Jay");
    }
}

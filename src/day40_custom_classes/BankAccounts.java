package day40_custom_classes;

public class BankAccounts {
    public static void main(String[] args) {
        //create an account
        CheckingAccount client1 = new CheckingAccount();
        //set data
        client1.accountNumber = 1287403284L;
        client1.accountHolder = "Wooden Spoon";
        client1.balance = 500.0;
        client1.getAccountInfo();


        CheckingAccount client2 = new CheckingAccount();
        client2.setInfo(300000000.0,1298463012L,"Donald Trump");
        client2.getAccountInfo();

        client1.deposit(300);
        client1.getAccountInfo();
        System.out.println("---------------------------------------------");
        client1.deposit(300);
        client1.getAccountInfo();

        client1.withDraw(100);
        client1.getAccountInfo();

        client2.withDraw(1000000000);
        client2.getAccountInfo();
        System.out.println("-----------------");
        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setInfo(200,2309481093L,"Master Muhtar");
        myAccount.purchase("headPhones",201.99);


    }
}

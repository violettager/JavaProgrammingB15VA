package day59_exceptions_collection1;

public class TestCustomException {
    public static void main(String[] args) {
        double balance = 200;
        double price = 145.99;
        String itemName = "Shoes";
        if(price>balance){
            throw new InsufficientFundsException("NOT enough funds for this transaction");
        }else{
            balance-= price;
            System.out.println("Transaction successful ! enjoy your new "+ itemName);
            System.out.println("Remaining balance  = "+ balance);
        }
    }
}

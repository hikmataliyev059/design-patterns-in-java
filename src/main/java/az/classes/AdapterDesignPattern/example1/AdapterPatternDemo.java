package az.classes.AdapterDesignPattern.example1;

public class AdapterPatternDemo { // Client class

    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
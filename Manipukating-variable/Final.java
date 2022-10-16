public class Final {

    public static void main(String[] args) { 
        final double pi = 3.14;
        System.out.println(pi);
        }
    
}

// final keyword is a value that cannot be chnages (e.g const in JS)


class BankAccount {
    public static void main(String[] args){
    double balance = 1000.75;
    double amountToWithdraw = 250;
    
    double updatedBalance = balance - amountToWithdraw;
    double amountForEachFriend = updatedBalance/3;
    boolean canPurchaseTicket = amountForEachFriend >= 250;
    System.out.println(canPurchaseTicket);
    
    System.out.println("I gave each friend "+amountForEachFriend+"...");
  }       
}


public class MainPayment {
    public static void main(String[] args) throws Exception {
        CreditCard creditCard = new CreditCard();

        DebitCard debitCard = new DebitCard();
        debitCard.validate();
        debitCard.collectPayment();
        
        creditCard.validate();
        creditCard.collectPayment();

        BankRewards rewards = new BankRewards();
        rewards.validate();
        rewards.collectPayment();
    }
}
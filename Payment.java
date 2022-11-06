
public class Payment {

    double amount;

    Payment(double val) {
        this.amount = Math.round(val * 100) / 100.0;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
// ------------------------------------------

class CashPayment extends Payment {

    CashPayment(double val) {
        super(val);
    }

    public void paymentDetails() {
        System.out.println("The payment amount is=" + this.amount);
    }
}
// ------------------------------------------
class CreditCardPayment extends Payment {

    String CardName, ExpirationDate, CreditCardNumber;

    CreditCardPayment(double val, String CardName, String ExpirationDate, String CreditCardNumber) {
        super(val);
        this.CardName = CardName;
        this.ExpirationDate = ExpirationDate;
        this.CreditCardNumber = CreditCardNumber;
    }

    public void paymentDetails() {
        System.out.println("The payment of Amount " + this.amount + "by the card " + this.CreditCardNumber + " with the expiry date " + this.ExpirationDate + " by the card holder " + this.CardName);
    }
}

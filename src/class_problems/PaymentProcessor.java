package class_problems;

abstract class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract double getAdjustedAmount();
    public abstract String getType();
}

class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    public double getAdjustedAmount() {
        return this.amount + (this.amount * 0.02);
    }

    public String getType() {
        return "CARD";
    }
}

class WalletPayment extends Payment {
    public WalletPayment(double amount) {
        super(amount);
    }

    public double getAdjustedAmount() {
        return this.amount + (this.amount * 0.01);
    }

    public String getType() {
        return "WALLET";
    }
}

class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    public double getAdjustedAmount() {
        return this.amount;
    }

    public String getType() {
        return "BANKTRANSFER";
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment[] transactions = new Payment[3];
        transactions[0] = new CardPayment(1000);
        transactions[1] = new WalletPayment(500);
        transactions[2] = new BankTransferPayment(2000);

        double grandTotal = 0;

        for (int i = 0; i < transactions.length; i++) {
            double adjusted = transactions[i].getAdjustedAmount();
            System.out.printf("%s: %.2f\n", transactions[i].getType(), adjusted);
            grandTotal = grandTotal + adjusted;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}

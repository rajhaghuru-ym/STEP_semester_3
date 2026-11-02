package class_problems;

public class PiggyBank {
    private final String id;
    private int savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.savings = this.savings + amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.savings) {
            this.savings = this.savings - amount;
        }
    }

    public int getSavings() {
        return this.savings;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");

        pb.deposit(100);
        System.out.println(pb.getSavings());

        pb.withdraw(30);
        System.out.println(pb.getSavings());

        pb.withdraw(500);
        System.out.println(pb.getSavings());
    }
}
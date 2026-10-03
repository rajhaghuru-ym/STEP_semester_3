package assignment_problems;

public class Cart {
    private final String cartId;
    private int[] prices;
    private int count;

    public Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        this.prices = new int[maxItems];
        this.count = 0;
    }

    public void addItem(int price) {
        if (this.count < this.prices.length) {
            this.prices[this.count] = price;
            this.count = this.count + 1;
        }
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.count; i++) {
            total = total + this.prices[i];
        }
        return total;
    }

    public int getItemCount() {
        return this.count;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println(cart.getTotal());
        System.out.println(cart.getItemCount());
    }
}
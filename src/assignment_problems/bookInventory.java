package assignment_problems;
class BookInventory {
    String title;
    String author;
    int copiesAvailable;

    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void printEntry() {
        System.out.println(this.title + " by " + this.author + " " + this.copiesAvailable + " copies available");
    }

    public static void main(String[] args) {
        BookInventory b1 = new BookInventory("Clean Code", "Robert C. Martin", 3);
        BookInventory b2 = new BookInventory("Effective Java", "Joshua Bloch", 5);
        BookInventory b3 = new BookInventory("Refactoring", "Martin Fowler", 0);
        BookInventory b4 = new BookInventory("Design Patterns", "GoF", 2);

        BookInventory[] inventory = new BookInventory[4];
        inventory[0] = b1;
        inventory[1] = b2;
        inventory[2] = b3;
        inventory[3] = b4;

        for (int i = 0; i < inventory.length; i++) {
            inventory[i].printEntry();
        }
    }
}
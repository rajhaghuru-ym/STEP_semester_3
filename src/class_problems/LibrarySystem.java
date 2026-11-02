package class_problems;

import java.time.LocalDate;

abstract class LibraryItem {
    String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract LocalDate getDueDate(LocalDate checkoutDate);
}

class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    public LocalDate getDueDate(LocalDate checkoutDate) {
        return checkoutDate.plusDays(14);
    }
}

class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }

    public LocalDate getDueDate(LocalDate checkoutDate) {
        return checkoutDate.plusDays(7);
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    public LocalDate getDueDate(LocalDate checkoutDate) {
        return checkoutDate.plusDays(3);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("1984");
        items[1] = new DVD("The Matrix");
        items[2] = new Magazine("Forbes Issue 500");

        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < items.length; i++) {
            LocalDate dueDate = items[i].getDueDate(currentDate);
            System.out.println(items[i].title + ": " + dueDate);
        }
    }
}
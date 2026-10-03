package class_problems;

abstract class LibraryItem {
    String title;
    int daysLate;

    public LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    public abstract double getFine();
}

class BookItem extends LibraryItem {
    public BookItem(String title, int daysLate) {
        super(title, daysLate);
    }

    public double getFine() {
        return this.daysLate * 2.0;
    }
}

class DvdItem extends LibraryItem {
    public DvdItem(String title, int daysLate) {
        super(title, daysLate);
    }

    public double getFine() {
        double fine = this.daysLate * 5.0;
        if (fine > 50.0) {
            return 50.0;
        }
        return fine;
    }
}

class MagazineItem extends LibraryItem {
    public MagazineItem(String title, int daysLate) {
        super(title, daysLate);
    }

    public double getFine() {
        return this.daysLate * 1.0;
    }
}

public class LibraryLateFine {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new BookItem("Algebra", 4);
        items[1] = new DvdItem("Inception", 12);
        items[2] = new MagazineItem("Sports", 3);

        double totalFines = 0;

        for (int i = 0; i < items.length; i++) {
            double fine = items[i].getFine();
            System.out.printf("%s: %.2f\n", items[i].title, fine);
            totalFines = totalFines + fine;
        }

        System.out.printf("Total Fines: %.2f\n", totalFines);
    }
}
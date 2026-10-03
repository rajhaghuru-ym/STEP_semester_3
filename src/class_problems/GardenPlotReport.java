package class_problems;

abstract class Plot {
    String owner;

    public Plot(String owner) {
        this.owner = owner;
    }

    public abstract double getArea();
    public abstract String getShape();
}

class Circle extends Plot {
    double radius;

    public Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String getShape() {
        return "CIRCLE";
    }
}

class Rectangle extends Plot {
    double length;
    double width;

    public Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public String getShape() {
        return "RECTANGLE";
    }
}

class Triangle extends Plot {
    double base;
    double height;

    public Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    public String getShape() {
        return "TRIANGLE";
    }
}

public class GardenPlotReport {
    public static void main(String[] args) {
        Plot[] plots = new Plot[3];
        plots[0] = new Circle("Asha", 5);
        plots[1] = new Rectangle("Ravi", 4, 6);
        plots[2] = new Triangle("Neha", 10, 3);

        double totalArea = 0;

        for (int i = 0; i < plots.length; i++) {
            double area = plots[i].getArea();
            System.out.printf("%s (%s): %.2f\n", plots[i].owner, plots[i].getShape(), area);
            totalArea = totalArea + area;
        }

        System.out.printf("Total Area: %.2f\n", totalArea);
    }
}

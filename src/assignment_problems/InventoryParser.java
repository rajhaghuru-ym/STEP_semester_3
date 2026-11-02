package assignment_problems;

public class InventoryParser {
    public void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length == 3) {
            String product = fields[0];
            String sku = fields[1];
            String qty = fields[2];

            System.out.println("Product: " + product + " | SKU: " + sku + " | Qty: " + qty);
        } else {
            System.out.println("Invalid Record");
        }
    }

    public static void main(String[] args) {
        InventoryParser parser = new InventoryParser();
        parser.parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parser.parseInventoryRecord("Wireless Mouse,150");
    }
}

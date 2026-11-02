package class_problems;

public class BankTransactionValidator {

    public String normalizeReference(String raw) {
        String trimmed = raw.trim();

        if (trimmed.length() < 3) {
            return trimmed;
        }

        String bankCode = trimmed.substring(0, 3).toUpperCase();
        String restOfCode = trimmed.substring(3);

        return bankCode + restOfCode;
    }

    public String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            char c = reference.charAt(i);
            if (!Character.isLetter(c)) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < 14; i++) {
            char c = reference.charAt(i);
            if (!Character.isDigit(c)) {
                return "Invalid: body must be numeric digits";
            }
        }

        String bankCode = reference.substring(0, 3);
        String day = reference.substring(3, 5);
        String month = reference.substring(5, 7);
        String year = reference.substring(7, 9);
        String sequence = reference.substring(9, 14);

        StringBuilder display = new StringBuilder();
        display.append("[").append(bankCode).append("] ");
        display.append("DATE: ").append(day).append("/").append(month).append("/").append(year);
        display.append(" | SEQ: ").append(sequence);

        return display.toString();
    }

    public static void main(String[] args) {
        BankTransactionValidator validator = new BankTransactionValidator();

        String raw1 = " hdf03022600042 ";
        String clean1 = validator.normalizeReference(raw1);
        System.out.println(validator.validateAndFormat(clean1));

        String raw2 = "12F03022600042";
        String clean2 = validator.normalizeReference(raw2);
        System.out.println(validator.validateAndFormat(clean2));
    }
}
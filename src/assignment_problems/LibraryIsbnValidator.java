package assignment_problems;

public class LibraryIsbnValidator {
    public String normalizeCode(String raw) {
        String trimmed = raw.trim();

        if (trimmed.length() < 3) {
            return trimmed;
        }

        String pubCode = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);

        return pubCode + rest;
    }

    public String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            char c = code.charAt(i);
            if (!Character.isLetter(c)) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            char c = code.charAt(i);
            if (!Character.isDigit(c)) {
                return "Invalid: body must be numeric digits";
            }
        }

        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        StringBuilder display = new StringBuilder();
        display.append("[").append(pubCode).append("] ");
        display.append("YEAR: ").append(year);
        display.append(" | CATALOG: ").append(catalog);

        return display.toString();
    }

    public static void main(String[] args) {
        LibraryIsbnValidator validator = new LibraryIsbnValidator();

        String raw1 = " pen2026004251 ";
        String clean1 = validator.normalizeCode(raw1);
        System.out.println(validator.validateAndFormat(clean1));

        String raw2 = "12N2026004251";
        String clean2 = validator.normalizeCode(raw2);
        System.out.println(validator.validateAndFormat(clean2));
    }
}
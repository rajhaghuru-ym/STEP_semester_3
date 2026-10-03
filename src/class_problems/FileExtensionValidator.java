package class_problems;

public class FileExtensionValidator {

    public String validateFileExtension(String filename) {
        // Find where the last dot is
        int dotIndex = filename.lastIndexOf('.');

        // If there is no dot, it is invalid
        if (dotIndex == -1) {
            return "Rejected — invalid file type";
        }

        // Get the letters after the dot
        String extension = filename.substring(dotIndex + 1);

        // Check if it matches our allowed types (ignoring capital letters)
        if (extension.equalsIgnoreCase("pdf")) {
            return "Accepted";
        } else if (extension.equalsIgnoreCase("docx")) {
            return "Accepted";
        } else if (extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        FileExtensionValidator validator = new FileExtensionValidator();
        System.out.println(validator.validateFileExtension("Assignment1.PDF"));
        System.out.println(validator.validateFileExtension("notes.txt"));
    }
}
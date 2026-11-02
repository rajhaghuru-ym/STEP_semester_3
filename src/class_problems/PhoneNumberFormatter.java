package class_problems;
public class PhoneNumberFormatter {

    public String maskPhoneNumber(String phone) {
        // 1. Check if it is exactly 10 characters long
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // 2. Check if every single character is a number
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (!Character.isDigit(c)) {
                return "Invalid phone number";
            }
        }

        // 3. Build the masked number using basic StringBuilder as requested
        StringBuilder masked = new StringBuilder();
        masked.append("XXXXXX");
        masked.append("-");

        // Get just the last 4 numbers
        String lastFour = phone.substring(6);
        masked.append(lastFour);

        return masked.toString();
    }

    public static void main(String[] args) {
        PhoneNumberFormatter formatter = new PhoneNumberFormatter();
        System.out.println(formatter.maskPhoneNumber("9876543210"));
        System.out.println(formatter.maskPhoneNumber("98765"));
    }
}
package strings.class_problems;

class RevName {
    public static void main(String[] args) {
        String name = "Sunil";
        String rev = revName(name);

        System.out.println("Original: " + name);
        System.out.println("Reversed: " + rev);
    }

    public static String revName(String name) {
        String res = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            res = res + name.charAt(i);
        }

        return res;
    }
}
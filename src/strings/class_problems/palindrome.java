package strings.class_problems;

class Palindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";

        System.out.println(s1);
        System.out.println("Iterative: " + isPalIter(s1));
        System.out.println("Recursive: " + isPalRec(s1));
        System.out.println("Array: " + isPalArr(s1));

        System.out.println(s2);
        System.out.println("Iterative: " + isPalIter(s2));
        System.out.println("Recursive: " + isPalRec(s2));
        System.out.println("Array: " + isPalArr(s2));
    }

    public static boolean isPalIter(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalRec(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        String mid = s.substring(1, s.length() - 1);
        return isPalRec(mid);
    }

    public static boolean isPalArr(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        char[] rev = new char[len];

        for (int i = 0; i < len; i++) {
            rev[i] = arr[len - 1 - i];
        }

        String rStr = new String(rev);
        return s.equals(rStr);
    }
}
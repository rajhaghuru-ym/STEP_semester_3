package class_problems;

class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }


    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return this.credits + this.labCredits;
    }

    public static void main(String[] args) {
        Course theory = new Course("21CSC201J", "Data Structures", 4);
        System.out.println(theory.code + " total credits: " + theory.totalCredits());

        Course lab = new Course("21CSC205L", "DSA Lab", 3, 1);
        System.out.println(lab.code + " total credits: " + lab.totalCredits());
    }
}
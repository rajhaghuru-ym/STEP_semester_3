package class_problems;

abstract class Question {
    String text;
    String correctAnswer;
    String studentAnswer;
    double points;

    public Question(String text, String correctAnswer, String studentAnswer, double points) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    public abstract double calculateScore();
    public abstract String getType();
}

class MCQ extends Question {
    public MCQ(String text, String correctAnswer, String studentAnswer, double points) {
        super(text, correctAnswer, studentAnswer, points);
    }

    public double calculateScore() {
        if (this.studentAnswer.equalsIgnoreCase(this.correctAnswer)) {
            return this.points;
        }
        return 0.0;
    }

    public String getType() {
        return "MCQ";
    }
}

class TF extends Question {
    public TF(String text, String correctAnswer, String studentAnswer, double points) {
        super(text, correctAnswer, studentAnswer, points);
    }

    public double calculateScore() {
        if (this.studentAnswer.equalsIgnoreCase(this.correctAnswer)) {
            return this.points;
        }
        return 0.0;
    }

    public String getType() {
        return "TF";
    }
}

class Essay extends Question {
    public Essay(String text, String correctAnswer, String studentAnswer, double points) {
        super(text, correctAnswer, studentAnswer, points);
    }

    public double calculateScore() {
        String[] keywords = this.correctAnswer.split(",");
        int matchCount = 0;
        String answerLower = this.studentAnswer.toLowerCase();

        for (int i = 0; i < keywords.length; i++) {
            String keyword = keywords[i].trim().toLowerCase();
            if (answerLower.contains(keyword)) {
                matchCount = matchCount + 1;
            }
        }

        if (matchCount >= 2) {
            return this.points * 0.75;
        } else if (matchCount == 1) {
            return this.points * 0.50;
        }
        return 0.0;
    }

    public String getType() {
        return "ESSAY";
    }
}

public class QuestionGrader {
    public static void main(String[] args) {
        Question[] questions = new Question[4];
        questions[0] = new MCQ("What is the capital of France?", "Paris", "Paris", 10);
        questions[1] = new TF("The Earth is flat?", "False", "True", 5);
        questions[2] = new Essay("Name two primary OOP principles.", "Inheritance, Polymorphism, Encapsulation", "Polymorphism is one.", 20);
        questions[3] = new Essay("Describe abstraction and composition.", "Abstraction, Composition", "I talked about abstraction.", 15);

        double totalScore = 0;

        for (int i = 0; i < questions.length; i++) {
            double score = questions[i].calculateScore();
            System.out.printf("%s: %.2f\n", questions[i].getType(), score);
            totalScore = totalScore + score;
        }

        System.out.printf("Total Score: %.2f\n", totalScore);
    }
}

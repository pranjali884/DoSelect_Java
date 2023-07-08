package doSelect;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Classroom {
    public String registerStudent(Student student) {
        if (!isValidName(student.name)) {
            return "Block letters needed";
        }
        if (!isValidScore(student.score)) {
            return "Invalid score";
        }
        return "Registered";
    }

    public String studentCard(String card) {
        if (!isValidCard(card)) {
            return "Invalid card";
        }
        return "Valid card";
    }

    private boolean isValidName(String name) {
        return name.equals(name.toUpperCase());
    }

    private boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    private boolean isValidCard(String card) {
        return card.matches("[0-9]+");
    }
}

public class Ma {
    public static void main(String[] args) {
        Student s1 = new Student("A", 6);
        Classroom cm = new Classroom();
        String registrationStatus = cm.registerStudent(s1);
        System.out.println(registrationStatus);
    }
}

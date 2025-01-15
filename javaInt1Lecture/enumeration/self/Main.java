package javaInt1Lecture.enumeration.self;

public class Main {
    public static void main(String[] args) {
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            System.out.println("Name: " + grade.name() + ", Ordinal: " + grade.ordinal());
        }
    }
}

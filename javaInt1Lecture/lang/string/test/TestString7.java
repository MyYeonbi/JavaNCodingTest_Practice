package javaInt1Lecture.lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "     Hello World   ";
        String trimmed = original.strip();

        System.out.println("trimmed: " + trimmed);
    }
}

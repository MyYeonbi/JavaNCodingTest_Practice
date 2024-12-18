package javaBasicLecture.ref.oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area = calculateArea();

    int calculateArea() {

        return width * height;
    }
    int calculatePerimeter() {
        return 2 * width + 2 * height;
    }
    boolean isSquare() {
        return width == height;
    }

}

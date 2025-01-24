package javaInt2Lecture.generic.test.ex5;

public class EraserBox <T>{

    public boolean instanceCheck(Object param) {
        return param instanceof T;
    }
}

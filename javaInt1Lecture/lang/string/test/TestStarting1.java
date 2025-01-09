package javaInt1Lecture.lang.string.test;

public class TestStarting1 {
    public static void main(String[] args) {
        String url = "http://www.baidu.com";
        boolean result = url.startsWith("https://");
        System.out.println("result = " + result);
    }
}

package javaInt1Lecture.lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교" + (str1 == str2));
        System.out.println("new String() equals 비교:" + str1.equals(str2));


    }
}

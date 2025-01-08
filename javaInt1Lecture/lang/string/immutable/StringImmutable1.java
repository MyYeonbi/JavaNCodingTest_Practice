package javaInt1Lecture.lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 =" + str1);
        System.out.println("str2 =" + str2);

        /*<String이 불변으로 설계된 이유>
        String은 자바 내부에서 문자열 풀을 통해 최적화를 한다.
        만약 String 내부의 값을 변경할 수 있다면,
        기존의 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되어 버리는 문제가 발생한다.
        그래서 사이트 이펙트 문자를 발생시키지 않기 위해서 불변으로 설계되었다.
        * */
    }
}

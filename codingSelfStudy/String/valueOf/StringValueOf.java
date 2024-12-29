package codingSelfStudy.String.valueOf;

public class StringValueOf {
    // 문자(char)를 문자열로 변환
    char c = 'a';
    String str = String.valueOf(c);

    // 문자 배열(char[])을 문자열로 변환
    char[] chars = {'h', 'e', 'l', 'l', 'o'};
    String ch = String.valueOf(chars);

    // 숫자를 문자열로 변환
    int num = 42;
    String s = String.valueOf(num);

    // 불리언 값을 문자여로 변환
    boolean flag = true;
    String b = String.valueOf(flag);

    // 객체를 문자열로 변환
    Object obj = new Object();
    String d = String.valueOf(obj);

    // null값을 문자열로 변환
    Object o = null;
    String f = String.valueOf(o);

    //1. 문자 변환 및 조합 - char과 String의 값을 넣어줄때는 ''과 ""를 감싸줘야 한다.
    char x = 'h';
    String y = String.valueOf(x) + "i";

    //2. 문자 배열을 문자열로 변환 -
    char [] z = {'w', 'e', 'l', 'l', 'o'};
    String w = String.valueOf(z);

    //3. 안전한 null처리
    Object obj1 = null;
    String y1 = String.valueOf(obj1);

    //4. 숫자와 문자를 함께 처리
    int num1 = 123;
    char c1 = 'h';
    String c2 = String.valueOf(num1) + String.valueOf(c1);


    public static void main(String[] args) {
        StringValueOf sv = new StringValueOf();
        System.out.println(sv.str);
        System.out.println(sv.ch);
        System.out.println(sv.s);
        System.out.println(sv.b);
        System.out.println(sv.d);
        System.out.println(sv.o);
        System.out.println(sv.y);
        System.out.println(sv.w);
        System.out.println(sv.y1);
        System.out.println(sv.c2);
    }
}

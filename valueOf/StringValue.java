package valueOf;

public class StringValue {
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


    public static void main(String[] args) {
        StringValue sv = new StringValue();
        System.out.println(sv.str);
        System.out.println(sv.ch);
        System.out.println(sv.s);
        System.out.println(sv.b);
        System.out.println(sv.d);
        System.out.println(sv.o);
    }
}

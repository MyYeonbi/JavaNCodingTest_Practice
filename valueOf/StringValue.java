package valueOf;

public class StringValue {
    // 문자(char)를 문자열로 변환
    char c = 'a';
    String str = String.valueOf(c);

    // 문자 배열(char[])을 문자열로 변환
    char[] chars = {'h', 'e', 'l', 'l', 'o'};
    String ch = String.valueOf(chars);

    public static void main(String[] args) {
        StringValue sv = new StringValue();
        System.out.println(sv.str);
        System.out.println(sv.chars);
    }
}

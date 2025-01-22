package codingSelfStudy.String.charr;

public class CharToNumberExample {
    public static void main(String[] args) {
        char c = '5';
        int numbericValue = c - '0';
        System.out.println(numbericValue);

        //메서드를 사용하여 숫자로 변환하는 법
        char d = '6';
        int numbericValue2 = Character.getNumericValue(d);
        System.out.println(numbericValue2);
    }
}

package codingSelfStudy.integger;

public class StringToNumber {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        StringToNumber stringToNumber = new StringToNumber();
        System.out.println(stringToNumber.solution("542"));
    }
}

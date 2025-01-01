package array.stringArray;

public class StringCaseChanger {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();  // 결과 문자열 저장용

        for (char ch : my_string.toCharArray()) {  //문자열의 각 문자 순회
            if (Character.isUpperCase(ch)) { //대문자인 경우
                result.append(Character.toLowerCase(ch)); //소문자로 변환후 추가
            } else if (Character.isLowerCase(ch)) { // 소문자인 경우
                result.append(Character.toUpperCase(ch)); //대문자로 변환 후 추가
            }
        }
        return result.toString(); //변환된 문자열 반환
    }

    public static void main(String[] args) {
        StringCaseChanger stringCaseChanger = new StringCaseChanger();
        System.out.println(stringCaseChanger.solution("Hello World"));
    }
}

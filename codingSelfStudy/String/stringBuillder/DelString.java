package codingSelfStudy.String.stringBuillder;

public class DelString {
   public String solution(String my_string) {
       //제거할 모음을 문자열로 정의
       String vowels = "aeiou";
       StringBuilder sb = new StringBuilder();

       //입력 문자열을 한 글자씩 확인
       for (char c : my_string.toCharArray()) {
           //모음이 아닌 경우 StringBuilder에 추가
           if (!vowels.contains(String.valueOf(c))) {
               sb.append(c);
           }
       }
       //최종 문자열 반환
       return sb.toString();
   }

    public static void main(String[] args) {
        DelString delString = new DelString();
        System.out.println(delString.solution("abcd"));
    }
}

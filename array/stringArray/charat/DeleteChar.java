package array.stringArray.charat;

public class DeleteChar {

    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder(my_string); //StringBuilder생성
        char str = letter.charAt(0); //letter의 첫 번째 문자를 char로 추출

        for(int i =0; i< sb.length(); i++){ //StringBuilder 순회
            if(sb.charAt(i) == str){ //문자 비교
                sb.deleteCharAt(i); // 문자 제거
                i--; // 제거 후 인덱스 조정

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        DeleteChar dc = new DeleteChar();

        System.out.println(dc.solution("abcd", "c"));

    }
}

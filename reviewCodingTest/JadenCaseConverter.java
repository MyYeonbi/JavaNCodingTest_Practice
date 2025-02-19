package reviewCodingTest;
/*문자열의 각 단어에서 첫 문자는 대문자로, 나머지 문자는 소문자로 만드는 문제.*/

public class JadenCaseConverter {
    public String solution(String s) {
        //1. 리턴할 String을 담을 StringBuilder.
        StringBuilder result = new StringBuilder();

        //2. 이전 문자가 공백인지 여부를 확인하는 변수.
        boolean isStartOfWord = true;

        //3. String의 한 글자씩 순회돌기.- s.charAt(i)를 이용하여 한 글자씩 변수에 저장.
        for (int i = 0; i <s.length();i++) {
            char currentChar = s.charAt(i);

            // 4. 단어의 첫 문장 처리
            if (isStartOfWord) {
                if(Character.isLetter(currentChar)) {
                    // 4-1 첫 단어가 알파벳인지 아닌지를 또 if문을 통해 나눔.
                    result.append(Character.toUpperCase(currentChar));
                } else {
                    // 4-2 알파벳이라면 Character.toUpperCase를 통해 대문자로 바꾸고, 아니라면 그냥 추가
                    result.append(currentChar);
                }
                // 4-3 이전 문자가 공백인지를 확인하는 불린값을 false로 돌리기.
                isStartOfWord = false;
            } else {
                // 5. 이전 문자가 공백이 아닐시를 처리하는 가장 큰 틀의 if문의 else문 - 소문자로 바꾸는 메서드 사용. .
                result.append(Character.toLowerCase(currentChar));
            }

            // 6. 공백 확인하는 if문을 만들어 내부 함수에 이전 문자가 공백인 불린값을 true로 돌림.
            if ( currentChar == ' ') {
                isStartOfWord = true; // 다음 단어의 시작임을 표시.
            }

        }
        return result.toString();

    }

    public static void main(String[] args) {
        JadenCaseConverter j = new JadenCaseConverter();
        System.out.println(j.solution("i'm hungry"));

    }
}

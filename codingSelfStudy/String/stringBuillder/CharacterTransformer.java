package codingSelfStudy.String.stringBuillder;

class CharacterTransformer {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                result.append('A'); // 'a'를 'A'로 변환
            } else {
                result.append(Character.toLowerCase(c)); // 나머지는 소문자로 변환
            }
        }

        return result.toString();
    }

    // 실행 테스트용 main 메서드
    public static void main(String[] args) {
        CharacterTransformer transformer = new CharacterTransformer();

        // 테스트 케이스
        System.out.println(transformer.solution("aBcDefG"));  // 예상 출력: "Abcdefg"
        System.out.println(transformer.solution("Apple And Banana"));  // 예상 출력: "Apple and banAnA"
        System.out.println(transformer.solution("JAVA programming"));  // 예상 출력: "jAvA programming"
    }
}

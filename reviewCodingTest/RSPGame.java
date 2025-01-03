package reviewCodingTest;

public class RSPGame {
    public String solution (String rsp) {
        //결과를 저장할 StringBuilder사용
        StringBuilder result = new StringBuilder();

        //문자열의 각 문자 처리
        for (char ch : rsp.toCharArray()) {
            if (ch == '2') {
                result.append(0);
            } else if (ch == '0') {
                result.append('5');
            } else if (ch == '5') {
                result.append('2');
            }
        }
        // 변환된 문자열 반환
        return result.toString();
    }

    public static void main(String[] args) {
        RSPGame game = new RSPGame();
        System.out.println(game.solution("205"));
    }
}

package basic;

public class RockPaperScissors {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder(); //결과 문자열을 저장할 StirngBuilder

        for(char ch : rsp.toCharArray()) { // 입력 문자열의 각  문자에 대해 반복
            if (ch == '2') { //가위(2)를 이기려면 바위(0)를 냄
                result.append('0');
            } else if (ch == '0') { //  바위(0)를 이기려면 보(5)를 냄
                result.append('5');
            } else if (ch == '5') {
                result.append('2');
            }
            }
        return result.toString(); // 결과 문자열 반환
        }

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        System.out.println(rps.solution("205"));
    }
    }


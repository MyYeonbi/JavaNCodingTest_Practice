package reviewCodingTest;

public class HowManyCof {
    public int[] solution(int money) {
        int cup = money / 5500; // 나누기의 몫은 int이니깐 int형 변환 필요 없음
        int bud = money % 5500; // 남은돈 계산은 %로 간단하게!
        return new int[] {cup, bud}; //return 할 때의 배열 생성은 =을 붙이지 않는다. 그리고 배열 생성할 때 new int[] 형식인거 잊지말기
    }
}

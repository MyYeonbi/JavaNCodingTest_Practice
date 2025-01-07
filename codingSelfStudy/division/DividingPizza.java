package codingSelfStudy.division;

public class DividingPizza {
    /* 피자를 사람들에게 나눠줄 때 필요한 최소 피자 판수를 계산하기
    사람의 수n 을 받아, 7조각으로 나뉜 피자를 나눠줄 때
    모든 사람이 적어도 한 조각 이상 받을 수 있도록 최소한의 판을 계산하기.
    */
    public int solution(int n) {
        return (n+6) / 7;
        //올림 계산
    }

    public static void main(String[] args) {
        int num = 13;
        /*13 / 7 = 1.857 → 정수로 내림하면 1판만 나오지만, 이는 부족하므로 추가로 한 판이 필요.
	•	(13 + 6) / 7 = 19 / 7 = 2 → 정확히 2판이 계산된다.*/
        DividingPizza dp = new DividingPizza();
        System.out.println(dp.solution(num));
    }

    /* < 왜 +6을 하고 7로 나눠야 하나? - 올림문제 >
    일반적인 나눗셈에서는 n/7 하면 소수점 이하는 버린다.
    하지만 여기서는 모든 사람들이 최소한 1조각의 피자를 먹어야 하므로 소수점 이하를 버리면 안된다.
    그래서 '올림'이 필요하다.

    (n+6) /7은 정수 나눗셈으로 올림 효과를 구현하는 방법이다.
    정수 나눗셈에서 (n + k) /d 는 n/d를 올림한 결과를 얻을 수 있다.
    k = d-1 을 사용한다.
    n+6은 7의 배수로 올림이 된다. 
     */
}

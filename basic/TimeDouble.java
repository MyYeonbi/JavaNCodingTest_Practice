package basic;

public class TimeDouble {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        TimeDouble timeDouble = new TimeDouble();
        int n = 3;
        int t = 3;
        System.out.println(timeDouble.solution(n, t));
    }
}

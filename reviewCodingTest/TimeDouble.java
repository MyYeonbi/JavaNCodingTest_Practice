package reviewCodingTest;

public class TimeDouble {
    public int solution(int t, int n) {
        int answer = n;

        for(int i =1; i<=t; i++){
            answer *= 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        TimeDouble timeDouble = new TimeDouble();
        System.out.println(timeDouble.solution(5, 3));
    }
}

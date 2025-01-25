package codingSelfStudy.math.evenOdd;

public class OddEvenClassifier {
    public String solution(int number) {
        String answer;

        if (number % 2 == 0) {
            return answer = "Even";
        } else {
            return answer = "Odd";
        }
    }
    public static void main(String[] args) {
        OddEvenClassifier o = new OddEvenClassifier();
        System.out.println(o.solution(1));
    }
}

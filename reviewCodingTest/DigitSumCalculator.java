package reviewCodingTest;

public class DigitSumCalculator {
    public int solution(String my_string) {
        int sum = 0;

        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                sum += c-'0';
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        DigitSumCalculator digitSumCalculator = new DigitSumCalculator();
        System.out.println(digitSumCalculator.solution("123"));
    }
}

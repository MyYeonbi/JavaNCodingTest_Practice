package reviewCodingTest;

public class DigitSumCalculator2 {

    public int solution(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

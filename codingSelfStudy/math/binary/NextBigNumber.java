package codingSelfStudy.math.binary;

public class NextBigNumber {
    public int solution(int n) {
        int countOne = Integer.bitCount(n); // n의 1의 개수 저장
        int nextNumber = n + 1;

        while (Integer.bitCount(nextNumber) != countOne) {
            nextNumber++; // 1의 개수가 같아질 때까지 증가
        }

        return nextNumber;
    }
}

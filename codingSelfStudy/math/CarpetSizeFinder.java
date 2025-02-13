package codingSelfStudy.math;
//노란색 격자(중앙)와 갈색 격자(테두리)로 구성된 카펫이 주어질 때, 카펫의 가로(width)와 세로(height)를 구하는 문제
public class CarpetSizeFinder {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow; // 전체 격자의 개수

        // width >= height 조건이 있으므로 큰 width부터 탐색
        for(int width = total; width >= 1; width--) {
            if (total % width == 0) { //width가 total의 약수인지 확인
                int height = total / width; // 대응하는 height 계산

                // (width - 2 ) * (height - 2) == yellow를 만족하는지 확인
                if ((width -2) * (height - 2) == yellow) {
                    return new int[]{width,height}; // 조건 만족 시 반환
                }

            }
        }
        return new int[]{}; // (예외 상황은 없지만 ) 결과가 없을 경우 빈 배열 반환.
    }
}

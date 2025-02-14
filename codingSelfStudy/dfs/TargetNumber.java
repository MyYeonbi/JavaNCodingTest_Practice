package codingSelfStudy.dfs;
/*타겟 넘버 문제는 주어진 숫자 배열을 사용하여 더하거나 빼서 목표 숫자(target)를 만드는 경우의 수를 구하는 문제*/
public class TargetNumber {
    int count = 0; // 가능한 경우의 수를 저장하는 변수

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }

    // DFS 재귀 함수
    private void dfs(int[] numbers, int target, int index, int sum) {
        // 배열 끝까지 탐색한 경우
        if (index == numbers.length) {
            if (sum == target) {
                count++; // 목표 값과 같으면 경우의 수 증가
            }
            return;
        }

        // 현재 숫자를 더하는 경우
        dfs(numbers, target, index + 1, sum + numbers[index]);

        // 현재 숫자를 빼는 경우
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}

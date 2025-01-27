package codingSelfStudy.String;

public class FindMinMax {
    public String solution (String s) {
        // 1. 입력 문자열을 공백 기준으로 나누기.
        String[] numbers = s.split(" ");

        // 2. 초기값 설정
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 3. 배열 순회하면서 최댓값, 최솟값 찾기
        for (String numStr : numbers) {
            try{
                int num = Integer.parseInt(numStr);
                if (num < min) min = num;
                if (num > max) max = num;

            } catch (NumberFormatException e) {
                // 만약 숫자가 아닌 값이 있다면 예외 처리
                throw new IllegalArgumentException("Invalid input: "+ numStr);

            }
        }
        // 4. 결과를 "min max" 형식의 문자열로 반환
        return min + " " + max;
    }
}

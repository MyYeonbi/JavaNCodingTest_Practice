package codingSelfStudy.String;

public class FindMinMax {
    public String solution (String s) {
        // 1. 입력 문자열을 공백 기준으로 나누기.
        String[] numbers = s.split(" ");
        // String열을 특정 기준으로 나누는 메서드는 s.split("기준");

        // 2. 초기값 설정
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 3. 배열 순회하면서 최댓값, 최솟값 찾기
        for (String numStr : numbers) {
            try{
                int num = Integer.parseInt(numStr);
                /*String을 Int형으로 바꾸는 것은
                for-each문을 사용했기에 요소의 하나만이 선택이 되기 때문에
                String 배열을 어떻게 Int형으로 바꿀지를 생각하지 않아도 됨. */

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

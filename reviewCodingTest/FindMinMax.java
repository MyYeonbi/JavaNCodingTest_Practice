package reviewCodingTest;

public class FindMinMax {
    public String solution(String s) {
        //1. 입력 문자열을 공백 기준으로 나누기. - String 배열로 값을 받아야 하며, 메서드 호출 방식은 변수이름.split("나누는 기준")..
        String[] numbers = s.split(" ");

        //2. 초기값 설정
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        // 3. 배열 순회하면서 최댓값, 최솟값 찾기
        for (String str : numbers) {
            try {
                int num = Integer.parseInt(str);
                if (num < min) min = num;
                if (num > max) max = num;
            } catch (NumberFormatException e) {
                throw new
                        IllegalArgumentException("Invalid input :" + str);
            }
        }
        //4. 결과를 "min max" 형식의 문자열로 변환
        return min + " " + max;
    }
}
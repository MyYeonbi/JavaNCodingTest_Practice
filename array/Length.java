package array;

public class Length {
    public int[] solution(String[] strlist) {
        int n = strlist.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Length length = new Length(); // 객체 생성
        String[] strlist = {"hello", "world", "java", "coding"};
        int[] result = length.solution(strlist); // solution 함수 호출

        // 결과 출력
        for (int len : result) {
            System.out.print(len + " ");
        }
    }
}

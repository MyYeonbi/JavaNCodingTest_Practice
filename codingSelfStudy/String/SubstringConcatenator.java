package codingSelfStudy.String;

public class SubstringConcatenator {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            result.append(my_strings[i].substring(start,end +1));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SubstringConcatenator combiner = new SubstringConcatenator();

        // 테스트 케이스 1
        String[] my_strings1 = {"apple", "banana", "cherry"};
        int[][] parts1 = {{1, 3}, {0, 2}, {2, 4}};
        String result1 = combiner.solution(my_strings1, parts1);
        System.out.println("결과 1: " + result1);  // 예상 출력: pplbanerr

        // 테스트 케이스 2
        String[] my_strings2 = {"hello", "world", "java"};
        int[][] parts2 = {{0, 2}, {1, 3}, {1, 2}};
        String result2 = combiner.solution(my_strings2, parts2);
        System.out.println("결과 2: " + result2);  // 예상 출력: helorlav

        // 테스트 케이스 3 (한 글자씩만 가져오는 경우)
        String[] my_strings3 = {"abc", "def", "ghi"};
        int[][] parts3 = {{0, 0}, {1, 1}, {2, 2}};
        String result3 = combiner.solution(my_strings3, parts3);
        System.out.println("결과 3: " + result3);  // 예상 출력: adg

    }
}

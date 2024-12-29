package codingSelfStudy.String.splitt;

public class Spllit {
    public static void main(String[] args) {
        String str = "apple,banana,cherry";
        String[] fruits = str.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 코테에서의 활용
        //1. 문자열 회전 문제 처리 - 입력한 문자열을 처리하고 특정 조건에 따라 변형할 때 사용.
        // 문자열 회전 : "abcde" -> "cdeab"
        String str1 = "abcde";
        int rotateBy = 2;
        String rotated = str1.substring(rotateBy)+str1.substring(0,rotateBy);
        System.out.println(rotated);  // 출력: cdeab

        //2. 줄 단위 입력 처리 - 코테에서 여러 줄 입력을 처리할 때
        String str2 = "line1\nline2\nline3";
        String[] lines = str2.split("\n"); // 줄 단위로 나누기
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

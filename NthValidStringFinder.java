import java.util.*;

public class NthValidStringFinder {
    static List<String> orderList = new ArrayList<>();
    static final char[] ALPHABETS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void generateOrders(String current, int maxLength) {
        if (current.length() > maxLength) return;
        if (!current.isEmpty()) orderList.add(current);
        for (char c : ALPHABETS) {
            generateOrders(current + c, maxLength);
        }
    }

    public static boolean containsForbiddenPattern(String s, List<String> forbiddenPatterns) {
        for (String pattern : forbiddenPatterns) {
            if (s.contains(pattern)) {
                return true;
            }
        }
        return false;
    }

    public static String findNthValidString(int n, List<String> forbiddenPatterns) {
        // 모든 가능한 문자열 생성
        generateOrders("", 10);

        // 패턴이 포함되지 않은 문자열만 남기기
        List<String> validStrings = new ArrayList<>();
        for (String order : orderList) {
            if (!containsForbiddenPattern(order, forbiddenPatterns)) {
                validStrings.add(order);
            }
        }

        // n번째 문자열 반환 (1-based index)
        return validStrings.get(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> forbiddenPatterns = Arrays.asList("ab", "cd");

        String result = findNthValidString(n, forbiddenPatterns);
        System.out.println("The " + n + "th valid string: " + result);
    }
}

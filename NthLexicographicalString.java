import java.util.*;

public class NthLexicographicalString {
    static List<String> orderList = new ArrayList<>();
    static final char[] ALPHABETS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void generateOrders(String current, int maxLength) {
        if (current.length() > maxLength) return;
        if (!current.isEmpty()) orderList.add(current);
        for (char c : ALPHABETS) {
            generateOrders(current + c, maxLength);
        }
    }

    public static String findNthOrder(int n, List<String> bans) {
        // 모든 가능한 문자열 생성
        generateOrders("", 10);

        // 삭제된 문자열 제거
        Set<String> banSet = new HashSet<>(bans);
        List<String> filteredOrders = new ArrayList<>();
        for (String order : orderList) {
            if (!banSet.contains(order)) {
                filteredOrders.add(order);
            }
        }

        // n번째 문자열 반환 (1-based index)
        return filteredOrders.get(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        List<String> bans = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");

        String result = findNthOrder(n, bans);
        System.out.println("The " + n + "th order: " + result);
    }
}

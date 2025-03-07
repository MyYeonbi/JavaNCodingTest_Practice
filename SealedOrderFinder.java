import java.util.*;

public class SealedOrderFinder {
    static List<String> orderList = new ArrayList<>();
    static final char[] ALPHABETS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void generateOrders(String current, int maxLength) {
        if (current.length() > maxLength) return;
        orderList.add(current);
        for (char c : ALPHABETS) {
            generateOrders(current + c, maxLength);
        }
    }

    public static String findNthOrder(int n, List<String> bans) {
        // 모든 가능한 주문 생성
        generateOrders("", 11);

        // 삭제된 주문 제거
        Set<String> banSet = new HashSet<>(bans);
        List<String> filteredOrders = new ArrayList<>();
        for (String order : orderList) {
            if (!banSet.contains(order)) {
                filteredOrders.add(order);
            }
        }

        // n번째 주문 반환 (1-based index)
        return filteredOrders.get(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> bans = Arrays.asList("a", "b", "c", "d");

        String result = findNthOrder(n, bans);
        System.out.println("The " + n + "th order: " + result);
    }
}

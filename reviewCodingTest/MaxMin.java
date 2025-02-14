package reviewCodingTest;

public class MaxMin {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String str : numbers) {
            int num = Integer.parseInt(str);
            if (num > max) max = num;
            if (num < min) min = num;

        }
        return min +" "+ max;
    }
}

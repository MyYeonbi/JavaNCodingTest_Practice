package reviewCodingTest;

public class charA {

    public static void main(String[] args) {
        String str = "yeonbi";
        char[] charArray = str.toCharArray();

        System.out.println(charArray[1]);

        String str2 = new String(charArray);
        System.out.println(str2);
    }
}

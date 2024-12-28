package array.stringArray.charat;

public class ReverseChar {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder reversed = new StringBuilder(str);

        for(int i = reversed.length() -1; i >=0 ; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println(reversed); // 출력: "olleh"
    }
}

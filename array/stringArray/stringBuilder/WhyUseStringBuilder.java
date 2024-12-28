package array.stringArray.stringBuilder;

public class WhyUseStringBuilder {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";// 새로운 String 객체 생성

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // 매번 새로운 객체 생성
        }
        System.out.println(reversed);


        String str1 = "hi";
        StringBuilder reversed1 = new StringBuilder();

        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed1.append(str1.charAt(i)); // 기존 객체를 수정
        }
        System.out.println(reversed1.toString());  // 출력: "ih"
        }
    }


package codingSelfStudy.String;

public class CipherDecoder {
    public String solution(String cipher, int code) {
        StringBuilder decoded = new StringBuilder();

        //문자열의 각 문자를 확인
        for (int i= 0; i <cipher.length(); i++) {
            if ((i+1) % code == 0) {
                decoded.append(cipher.charAt(i));
            }
        }
        return decoded.toString();
    }

    public static void main(String[] args) {
        CipherDecoder cipherDecoder = new CipherDecoder();
        System.out.println(cipherDecoder.solution("abcdefgdfdf", 3));
    }
}

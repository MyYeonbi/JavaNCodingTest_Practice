package javaBasicLecture.poly.q2Poly;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver결제
        String payOption2 = "naver";
        int amount2 = 3000;
        payService.processPay(payOption2, amount2);

        // 잘못된 결제 수단 선택
        String payOption3 = "bad";

        //new결제
        String payOption4 = "naver";
        int amount4 = 1000;
        payService.processPay(payOption4, amount4);


    }
}

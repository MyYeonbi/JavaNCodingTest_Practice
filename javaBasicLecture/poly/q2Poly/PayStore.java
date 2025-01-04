package javaBasicLecture.poly.q2Poly;

public abstract class PayStore {

    public static Pay findPay(String option) {

        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new pay")) {
            return new NewPay();
        }
        else {
            return new DefaultPay();
        }

    }
}

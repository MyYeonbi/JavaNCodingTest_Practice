package javaBasicLecture.review.construct;

public class Account {
    String accountNumber;

    public Account(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()){
            throw new IllegalArgumentException("계좌번호는 공백으로 남길수 없습니다. ");
        }
        this.accountNumber = accountNumber;
    }

    // 기본 생성자
    public Account() {
        throw new IllegalArgumentException("계좌번호를 반드시 입력하세요");
    }
}

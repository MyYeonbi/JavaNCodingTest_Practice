package javaBasicLecture.review.construct;

public class AccountMain {
    public static void main(String[] args) {
       try {
           Account account = new Account(); // 기본 생성자 호출
       } catch (IllegalArgumentException e) {
           System.out.println("오류 발생: " + e.getMessage());
       }
    }
}

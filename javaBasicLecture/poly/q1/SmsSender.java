package javaBasicLecture.poly.q1;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 전송합니다." + message);
    }
}

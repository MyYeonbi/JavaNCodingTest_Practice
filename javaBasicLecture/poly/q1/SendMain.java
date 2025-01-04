package javaBasicLecture.poly.q1;

public class SendMain {

    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("우리 홈페이지에 오신걸 환영합니다.");
        }
    }
}

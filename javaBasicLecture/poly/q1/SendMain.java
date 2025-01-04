package javaBasicLecture.poly.q1;

public class SendMain {

    public static void main(String[] args) {
        Sender sender1 = new Sender();
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다.");
        }
    }
}

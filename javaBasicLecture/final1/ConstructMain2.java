package javaBasicLecture.final1;

public class ConstructMain2 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Construct.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 :" + currentUserCount);
        if (currentUserCount > Construct.MAX_USERS) {
            System.out.println("대기자로 등록합니다. ");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}

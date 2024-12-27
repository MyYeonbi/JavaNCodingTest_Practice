package javaBasicLecture.final1;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myid", "kim");
        member.print();
        member.changeData("myId2", "seo");
        member.print();
    }
}

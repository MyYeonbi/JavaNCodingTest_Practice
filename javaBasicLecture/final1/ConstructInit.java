package javaBasicLecture.final1;

public class ConstructInit {

    // final을 넣은 멤버 변수는 생성자를 통해서 넣어줘야 한다.
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}

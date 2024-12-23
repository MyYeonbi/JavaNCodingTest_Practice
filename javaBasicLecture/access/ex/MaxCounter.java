package javaBasicLecture.access.ex;

public class MaxCounter {
    //이 클래스는 최대값을 지정하고 최대값 까지만 같이 증가하는 기능을 제공한다.
    private int count =0;
    private int max;


    // 요구 사항 : 1. 접근 제어자를 사용해서 데이터를 캡슐화 하세요.
    // 2. 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        //실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}

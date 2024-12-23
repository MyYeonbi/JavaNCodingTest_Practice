package javaBasicLecture.access.ex;

public class MaxCounter {
    //이 클래스는 최대값을 지정하고 최대값 까지만 같이 증가하는 기능을 제공한다.
    private int count =0;
    int max;

    public MaxCounter(int max) {
        if (max < 100) {
            max +=count;
        } else {
            System.out.println( "최대값이 넘었습니다. ");
        }


    }

    public int increment {
        count += 10;
    }

    public int getCount() {
        return count;
    }
}

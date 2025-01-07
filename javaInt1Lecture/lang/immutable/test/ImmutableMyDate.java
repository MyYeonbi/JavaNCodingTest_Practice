package javaInt1Lecture.lang.immutable.test;

public class ImmutableMyDate {
    //사이드 이펙트를 방지하기 위해 필드에 final 설정.
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newyear) {
        return new ImmutableMyDate(newyear, month, day);
    }

    public ImmutableMyDate withMonth(int newmonth) {
        return new ImmutableMyDate(year, newmonth, day);
    }

    public ImmutableMyDate withDay(int newday) {
        return new ImmutableMyDate(year, month, newday);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

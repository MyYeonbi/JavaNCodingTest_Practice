package javaBasicLecture.poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("===== parent1 호출 =========");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("========= parent2 호출=========");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) {
            //만약에 Child인스턴스로 생성된 Parent 객체 타입이라면,
            System.out.println("Child 인스턴스 맞음");
            //parent.childMethod();를 호출하고 싶다.다운 캐스팅은 가능하므로
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println(" Child 인스턴스 아님.");
        }
    }
}

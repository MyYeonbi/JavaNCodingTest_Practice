package javaBasicLecture.poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

         // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("================================");
        // 부모 변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // poly는 Parent타입, 참조는 Child타입.
        //poly는 Parent 타입이기 때문에 Parent메모리와 Child메모리 중에서 Parent메모리부터 메서드를 찾는다.
        // 또한, Parent 타입의 poly는 Child의 자식 클래스인 GrandChild가 있다면 이것도 참조로서 담을 수 있다.
        // Parent poly2 = new GrandChild();

        poly.parentMethod();

        // Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.

       //poly.childMethod(); // 자식의 기능은 호출할 수 없다.

    }
}

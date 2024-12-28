package javaBasicLecture.extends1.access.super1;

import com.sun.security.jgss.GSSUtil;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child, hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능.
        System.out.println("super value = " + super.value); // 부모의 value를 뜻함.

        this.hello(); //this 생략 가능
        super.hello();
    }
}

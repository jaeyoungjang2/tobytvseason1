package com.example.tobytvseason1;

import java.util.Arrays;
import java.util.List;

public class DynamicDispatch {
    static abstract class Service {
        abstract void run();
    }

    // 클래스 안에 완전히 독립적인 클래스를 만드려면 static을 선언해주면 된다.
    // 다른 파일로 만들기 귀찮아서, 보기 좋으라고 한 파일안에 클래스로 만들어 놓음
    static class MyService1 extends Service {

        @Override
        void run() {
            System.out.println("run1");
        }
    }
    static class MyService2 extends Service {

        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
        // dynamic dispatch 1
        Service svc = new MyService1();
        svc.run(); // receiver parameter

        // dynamic dispatch 2
        List<Service> svc2 = Arrays.asList(new MyService1(), new MyService2());
        svc2.forEach(Service::run); // 메서드 타입이 일치하면 가져와서 쓸 수 있다.
    }
}

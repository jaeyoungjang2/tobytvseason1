package com.example.tobytvseason1;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatch3 {
    interface  Post {
        void postOn(SNS sns);
    }
    static class Text implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }
    static class Picture implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }


    interface SNS {
        void post(Text post);
        void post(Picture post);
    }

    static class Facebook implements SNS {

        
        public void post(Text post) { System.out.println("text -> facebook"); }
        public void post(Picture post) { System.out.println("picture -> facebook"); }
    };
    static class Twitter implements SNS {
        public void post(Text post) { System.out.println("text -> twitter"); }
        public void post(Picture post) { System.out.println("picture -> twitter"); }
    };
    static class GooglePlus implements SNS {
        public void post(Text post) { System.out.println("text -> gp"); }
        public void post(Picture post) { System.out.println("picture -> gp"); }
    };

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter(), new GooglePlus());


//        for (Post p : posts) {
//            for (SNS s : sns) {
//                p.postOn(s);
//            }
//        }

        // 컴파일 시점에 에러 발생
        // 메서드 오버로딩이 일어나기 위해서는 static dispatch가 일어나야 하는데
        // 주어진 정보로는 어떤 메서드를 실행할 지 찍어낼 수가 없다.
        // 두가지가 각각 sns가 아닌 더 상세한 타입으로 적어놓았기 때문이다.
        posts.forEach(p -> sns.forEach((SNS s) -> p.postOn(s)));
//        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));

    }
}

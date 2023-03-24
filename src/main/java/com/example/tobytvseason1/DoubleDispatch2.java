//package com.example.tobytvseason1;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class DoubleDispatch2 {
//    interface  Post {
//        void postOn(Facebook sns);
//        void postOn(Twitter sns);
//    }
//    static class Text implements Post {
//        public void postOn(Facebook sns) {
//            System.out.println("text -> facebook");
//        }
//        public void postOn(Twitter sns) {
//            System.out.println("text -> twitter");
//        }
//    }
//    static class Picture implements Post {
//        public void postOn(Facebook sns) {
//            System.out.println("text -> facebook");
//        }
//        public void postOn(Twitter sns) {
//            System.out.println("text -> twitter");
//        }
//    }
//
//    interface SNS {}
//
//    static class Facebook implements SNS {
//    };
//    static class Twitter implements SNS {
//    };
//
//    public static void main(String[] args) {
//        List<Post> posts = Arrays.asList(new Text(), new Picture());
//        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter());
//
////        for (Post p : posts) {
////            for (SNS s : sns) {
////                p.postOn(s);
////            }
////        }
//
//        // 컴파일 시점에 에러 발생
//        // 메서드 오버로딩이 일어나기 위해서는 static dispatch가 일어나야 하는데
//        // 주어진 정보로는 어떤 메서드를 실행할 지 찍어낼 수가 없다.
//        // 두가지가 각각 sns가 아닌 더 상세한 타입으로 적어놓았기 때문이다.
//        posts.forEach(p -> sns.forEach((SNS s) -> p.postOn(s)));
////        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));
//
//    }
//}

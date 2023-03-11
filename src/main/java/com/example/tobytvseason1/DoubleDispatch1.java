//package com.example.tobytvseason1;
//
//import java.util.Arrays;
//import java.util.List;
//
//// type check를 if문을 이용해서 확인하고 있다.
//// 새로운 케이스가 들어올 때마다 if문을 추가해야하고, 이로인해 추가적인 문제가 발생할 수 있음.
//public class DoubleDispatch1 {
//    interface  Post { void postOn(SNS sns);}
//    static class Text implements Post {
//        public void postOn(SNS sns) {
//            if (sns instanceof Facebook) {
//                System.out.println("text -> facebook");
//            }
//            if (sns instanceof Twitter) {
//                System.out.println("text -> twitter");
//            }
//        }
//    }
//    static class Picture implements Post {
//        public void postOn(SNS sns) {
//            if (sns instanceof Facebook) {
//                System.out.println("picture -> facebook");
//            }
//            if (sns instanceof Twitter) {
//                System.out.println("picture -> twitter");
//            }
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
//        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));
//
//    }
//}

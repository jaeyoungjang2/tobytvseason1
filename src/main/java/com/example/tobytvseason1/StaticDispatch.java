package com.example.tobytvseason1;

import java.text.MessageFormat;

public class StaticDispatch {
    static class Service {

        void run(int number) {
            System.out.println("run(" + number + ")");
        }

        void run(String msg) {
            System.out.println("run(" + msg + ")");
        }
    }

    public static void main(String[] args) {
        int[] lotto45 = new int[6];
        boolean[] visit = new boolean[45];
        int index = 0;

        while (index < 6) {
            int num = (int) (Math.random() * 44) + 1;

            if (!visit[num]) {
                lotto45[index] = num;
                visit[num] = true;
                index ++;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%s 번째 공은 %s 번입니다.", i + 1, lotto45[i]));
            System.out.println(MessageFormat.format("{0} 번째 공은 {1} 번입니다.", i + 1, lotto45[i]));
            System.out.printf("");
        }

    }
}

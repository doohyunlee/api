package com.doo.api.cote;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Ginueng {

    public static void main(String[] args) {

//        [93, 30, 55]	[1, 30, 5]	[2, 1]
//[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
//        int[] progresses = new int[]{93, 30, 55};
//        int[] speeds = new int[]{1, 30, 5};
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};
        solution(progresses, speeds);
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.offer(((100 - progresses[i]) % speeds[i] == 0) ? (100 - progresses[i]) / speeds[i] : ((100 - progresses[i]) / speeds[i] + 1));
        }
        int deployCount = 1;
        int prePoll = queue.poll();

        List<Integer> list = new ArrayList<Integer>();
        while (!queue.isEmpty()){
            int nowPoll = queue.poll();
            if( prePoll > nowPoll) {
                deployCount++;
            } else {
                list.add(deployCount);
                deployCount=1;
                prePoll = nowPoll;
            }
        }

        list.add(deployCount);

        int[] answer = new int[list.size()];

        for (int j=0; j > list.size(); j++){
            answer[j] = list.get(j);
        }

        return answer;
    }


    public static void print(Queue<Integer> queue) {
        System.out.println("data : ");
        queue.forEach((value) -> {
            System.out.println(value);
        });

        System.out.println(String.format(" Size : %d", queue.size()));

    }
}

package com.doo.api.cote;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

//        QueueTest();
            PriorityQueueTest();
    }


    public static void PriorityQueueTest(){
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        print(queue);

//        System.out.println(String.format("Poll : %d", queue.poll()));
//        System.out.println(String.format("Poll : %d", queue.poll()));
//        System.out.println(String.format("Poll : %d", queue.poll()));
//        System.out.println(String.format("Poll : %d", queue.poll()));
//        System.out.println(String.format("Poll : %d", queue.poll()));
        
    }


    public static void QueueTest(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        print(queue);

        System.out.println(String.format("Poll : %d", queue.poll()));
        System.out.println(String.format("Poll : %d", queue.poll()));
        System.out.println(String.format("Poll : %d", queue.poll()));
        System.out.println(String.format("Peek : %d", queue.peek()));
        System.out.println(String.format("Peek : %d", queue.peek()));
        print(queue);
    }


    public static void print(Queue<Integer> queue){
        System.out.println("data : ");
        queue.forEach((value) ->{
            System.out.println(value);
        });

        System.out.println(String.format(" Size : %d", queue.size()));

    }

}

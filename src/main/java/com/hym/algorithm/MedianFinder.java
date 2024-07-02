package com.hym.algorithm;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> small, large;
    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder()); //max heap
        large = new PriorityQueue<>(); //min heap
    }

    public void addNum(int num) {
        int size = large.size() + small.size();
        if (size % 2 == 0) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
    }

    public double findMedian() {
        int size = large.size() + small.size();
        if(size % 2 == 0){
            //if even
            return (large.peek() + small.peek())/2.0;
        }
        //if odd
        return small.peek();
    }

}

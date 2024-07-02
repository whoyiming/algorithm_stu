package com.hym.algorithm;


import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class MaxHeapTest {

    @Test
    public void test1() {
        MaxHeap m = new MaxHeap(15);
        m.insert(10);
        m.insert(9);
        m.insert(8);
        m.insert(7);
        m.insert(6);
        m.insert(5);
        m.insert(4);
        m.insert(13);
        m.insert(2);
        m.insert(1);
        m.insert(17);

        assertEquals(17, m.extractMax());
        m.print();
        assertEquals(13, m.extractMax());
        m.print();
        assertEquals(10, m.extractMax());
        m.print();
        assertEquals(9, m.extractMax());
        m.print();
        assertEquals(8, m.extractMax());
        m.print();
        assertEquals(7, m.extractMax());
        m.print();
        assertEquals(6, m.extractMax());
        m.print();
        assertEquals(5, m.extractMax());
        m.print();
//        assertEquals(4, m.extractMax());
//        assertEquals(2, m.extractMax());
//        assertEquals(1, m.extractMax());
    }

    @Test
    public void test2() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        queue.add(3);
        queue.add(1);
        queue.add(9);
        queue.add(5);
        queue.add(8);
        queue.add(6);
        queue.add(7);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }

        List<Integer> list = new ArrayList<>();
        while (queue.peek() != null) {
            list.add(queue.poll());
        }

        System.out.println(list);
    }

    //使用TreeSet 取topK
    @Test
    public void test3() {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(6);
        treeSet.add(7);

        Iterator<Integer> iterator = treeSet.iterator();
        while ( iterator.hasNext() ) {
            System.out.println(iterator.next());
//            iterator.remove();
        }

        System.out.println(treeSet.stream().limit(5).collect(Collectors.toList()));
    }

    //使用PriorityQueue，取topK
    @Test
    public void test4 () {
        List<Integer> input = new ArrayList<Integer>();
        input.add(3);
        input.add(1);
        input.add(9);
        input.add(5);
        input.add(8);
        input.add(6);
        input.add(7);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        input.forEach(number -> {
            maxHeap.add(number);

            if (maxHeap.size() > 5) {
                maxHeap.poll();
            }
        });

        List<Integer> topKList = new ArrayList<>();
        //此处需要用peek pop方法，不能用iterator（itr只是遍历数据）
        while (maxHeap.peek() != null) {
            topKList.add(maxHeap.poll());
        }

        System.out.println(topKList);
    }

}

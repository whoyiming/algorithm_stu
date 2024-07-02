package com.hym.algorithm;

import java.util.TreeMap;

public class MedianFinder2 {
    class node{
        int val;node prev;node next;
        node(int v){val=v;prev=null;next=null;}
    }
    //will store median(if size is even it will store the first median)
    node median;
    int size;
    //it will store dll in sorted form
    node head;
    //it will store last occurence of each unqiue integer in dll
    TreeMap<Integer,node> h;
    public MedianFinder2() {
        median=null;
        size=0;
        head=null;
        h=new TreeMap();
    }

    public void addNum(int num) {
        size++;
        node curr=new node(num);
        //we find the last node starting from left whose value is less than num
        if(h.lowerKey(num)!=null){
            node key=h.get(h.lowerKey(num));
            curr.next=key.next;
            if(key.next!=null)key.next.prev=curr;
            curr.prev=key;
            key.next=curr;
        }else{
            if(head==null)head=curr;
            else{
                head.prev=curr;
                curr.next=head;
                head=curr;
            }
        }
        //we will move median left or right depending upon num
        if(h.get(num)==null) {h.put(num,curr);}
        if(size==1||size==2) {median=head;}
        else if(size==3) {median=head.next;}
        else if(size%2==0){
            if(median.val>=num)median=median.prev;
        }else{
            if(num>median.val)median=median.next;
        }
    }

    public double findMedian() {
        if(size%2!=0)return (double)median.val;
        else return (median.val+median.next.val)/((double)2);
    }
}

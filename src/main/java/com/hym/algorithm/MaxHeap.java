package com.hym.algorithm;

import java.util.Scanner;

/**
 * 完全二叉树是由满二叉树去掉最后一层右侧的若干节点而形成的二叉树结构。
 */
public class MaxHeap {
    private int[] heapData;
    private int size;
    private int maxsize;

    public MaxHeap(int size) {
        this.maxsize = size;
        this.size = 0;
        heapData = new int[this.maxsize + 1];
        heapData[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos)  ;
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }


    private void swap(int fpos, int spos) {
        int tmp = heapData[fpos];
        heapData[fpos] = heapData[spos];
        heapData[spos] = tmp;
    }

    private void downHeapify(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return;
        }

        if (heapData[pos] < heapData[leftChild(pos)] ||
                heapData[pos] < heapData[rightChild(pos)]) {

            if (heapData[leftChild(pos)] > heapData[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                downHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                downHeapify(rightChild(pos));
            }
        }
    }
    private void heapifyUp(int pos) {
        int temp = heapData[pos];
        while(pos>0 && temp > heapData[parent(pos)]){
            heapData[pos] = heapData[parent(pos)];
            pos = parent(pos);
        }
        heapData[pos] = temp;
    }


    public void insert(int element) {
        heapData[++size] = element;


        int current = size;
        heapifyUp(current);

    }

    public void print() {
        System.out.println("PARENT NODE" + "\t" + "LEFT CHILD NODE" + "\t" + "RIGHT CHILD NODE");
//            for (int k = 1; k <= size / 2; k++) {
//                System.out.print(" " + heapData[k] + "\t\t" + heapData[2 * k] + "\t\t" + heapData[2 * k + 1]);
//                System.out.println();
//            }
        for (int k = 1; k <= size / 2 - 1; k++) {
            System.out.print(" " + heapData[k] + "\t\t" + heapData[2 * k] + "\t\t" + heapData[2 * k + 1]);
            System.out.println();
        }
        int k = size / 2;
        if (size % 2 == 0 ) {
            System.out.print(" " + heapData[k] + "\t\t" + heapData[2 * k] + "\t\t" );
            System.out.println();
        } else {
            System.out.print(" " + heapData[k] + "\t\t" + heapData[2 * k] + "\t\t" + heapData[2 * k + 1]);
            System.out.println();
        }
    }

    public int extractMax() {
        int max = heapData[1];
        heapData[1] = heapData[size--];
        downHeapify(1);
        return max;
    }
    
    public static void main(String[] args){
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(1);
        maxHeap.insert(4);
        maxHeap.insert(2);
        maxHeap.insert(5);
        maxHeap.insert(13);
        maxHeap.insert(6);
        maxHeap.insert(17);

        maxHeap.print();
        System.out.println("The max is " + maxHeap.extractMax());
        maxHeap.print();
        System.out.println("The max is " + maxHeap.extractMax());
        maxHeap.print();
        System.out.println("The max is " + maxHeap.extractMax());
        maxHeap.print();

        // create scanner class object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Max Heap");

        int heapSize = sc.nextInt();

        MaxHeap heapObj = new MaxHeap(heapSize);

        for(int i = 1; i<= heapSize; i++) {
            System.out.print("Enter "+i+" element: ");
            int data = sc.nextInt();
            heapObj.insert(data);
        }

        // close scanner class obj
        sc.close();

        System.out.println("The max Heap is ");
        heapObj.print();

        //removing the root node from the heap
        System.out.println("After removing the maximum element(Root Node) "+heapObj.extractMax()+", Max heap is:");
        heapObj.print();
    }
}

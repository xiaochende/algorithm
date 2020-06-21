package com.chen.heap;

import java.util.Arrays;

public class Heapsort extends Heap{

    public Heapsort(int[] arr) {
        super(arr);
    }

    /**
     * 构建最大堆
     */
    void buildMaxHeap(){
        for(int i = size / 2 ; i > -1; i--){
            maxHeapify(i);
        }
    }
    /**
     * 排序
     */
    public void sort(){
        for(int i = (size-1) ; i > -1; i--){
            swap(0,i);
            size--;
            maxHeapify(0);
        }
    }
}

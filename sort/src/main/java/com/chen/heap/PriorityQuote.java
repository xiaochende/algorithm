package com.chen.heap;

import java.util.Arrays;

public class PriorityQuote extends Heap{

    public PriorityQuote() {
        arr = new int[10];
        size=0;
    }

    /**
     * 返回最大值
     * @return
     */
    public int maximum(){
        return arr[0];
    }

    /**
     * 插入新元素
     * @param x
     */
    public boolean insert(int x){
        if(arr.length == size) {
            arr = Arrays.copyOf(this.arr, size + (size >> 1));
        }
        size++;
        increaseKey(size-1 , x);
        return true;
    }

    /**
     * 返回最大元素 并从集合中去除它
     * @return
     */
    public int extractMax(){
        int max;
        max = arr[0];
        arr[0]=size;
        size--;
        maxHeapify(0);
        return max;
    }

    /**
     * 插入新元素 调整到符合最大堆规范
     * @param index
     * @param val
     */
    public void increaseKey(int index, int val){
        if(val < arr[index]){
            System.out.println("不符合最大堆规范");
            return;
        }
        arr[index]=val;
        while(index > -1 && arr[parent(index)] < arr[index]){
            swap(index , parent(index));
            index = parent(index);
        }
    }

    public void print(){
        for(int i =0;i< size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

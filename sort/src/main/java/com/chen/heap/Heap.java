package com.chen.heap;

import java.util.Arrays;

/**
 * 堆定义
 */
public class Heap {
    /**
     * 最大堆 arr[parent(i)] >= arr[i]
     * 最小堆 arr[parent(i)] <= arr[i]
     */

    public int[] arr;
    int size;

    public int parent(int i){
        return i/2;
    }
    public int left(int i){
        return i<<1;
    }
    public int right(int i){
        return (i<<1)+1;
    }
    public void swap(int i , int j){
        int k = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = k;
    }
    //最大堆
    public void maxHeapify(int i){
        int l = left(i);
        int r = right(i);
        int largest = i;
        //<editor-fold desc="选择i l r 三个下标中最大的值">
        if(l < this.size && this.arr[l] > this.arr[i]){
            largest = l;
        }else{
            largest = i;
        }
        if(r < this.size && this.arr[r] > this.arr[largest]){
            largest = r;
        }
        //</editor-fold>
        //
        if(largest != i){
            swap(i , largest);
            this.maxHeapify(largest);
        }
    }

    public Heap(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }
    public Heap(){}

    public void print(){
        Arrays.stream(arr).forEach(e->System.out.print(e+" "));
        System.out.println();
    }
}

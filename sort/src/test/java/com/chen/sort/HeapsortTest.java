package com.chen.sort;

import org.junit.Test;

public class HeapsortTest {

    int des[]={1,2,3,4,4,11,23,23,33,44,66,88,999};
    int sourec[]={1,2,3,4,66,33,44,999,88,23,11,23,4};
    @Test
    public void heapsort() {
        int arr[] =sourec;
        Heapsort heapsort = new Heapsort(arr);
        heapsort.sort();
        assert equalsArr(heapsort.arr , des);
    }

    @Test
    public void maxHeapify(){
        int arr[] = sourec;
        Heapsort heap= new Heapsort(arr);
        int result[]= {1,2,9999,4,66,33,44,999,88,23,11,23,4};
        heap.maxHeapify(2);
        heap.print();
        assert equalsArr(heap.arr , result);
    }

    public boolean equalsArr(int arr[] , int arr1[]){
        for(int i= 0 ;i < arr.length;i++){
            if (arr[i] != arr1[i]){return false;}
        }
        return true;
    }
}

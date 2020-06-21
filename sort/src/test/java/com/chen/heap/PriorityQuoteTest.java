package com.chen.heap;

import org.junit.Test;

public class PriorityQuoteTest {
    @Test
    public void insert() {
        PriorityQuote priorityQuote = new PriorityQuote();
        priorityQuote.insert(3);
        priorityQuote.insert(9);
        priorityQuote.insert(2);
        priorityQuote.insert(11);
        priorityQuote.insert(14);
        priorityQuote.insert(1);
        priorityQuote.print();
        int i = priorityQuote.extractMax();
        System.out.println(i);
        priorityQuote.print();
    }
}

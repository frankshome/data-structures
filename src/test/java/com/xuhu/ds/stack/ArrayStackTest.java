package com.xuhu.ds.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

    @Test
    public void testStack() {

        ArrayStack stack = new ArrayStack(Integer.class, 5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Assert.assertEquals(5, stack.size());

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }

        Assert.assertEquals(0, stack.size());


        ArrayStack<String> strStack = new ArrayStack<>(String.class, 3);
        strStack.push("A");
        strStack.push("B");
        strStack.push("C");

        size = strStack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(strStack.pop());
        }


    }
}
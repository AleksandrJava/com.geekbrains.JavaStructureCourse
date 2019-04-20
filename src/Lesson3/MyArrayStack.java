package Lesson3;

import java.util.NoSuchElementException;

public class MyArrayStack<T> {
    private Object[] stack = new Object[1];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void resize(int capacity){
        Object[] newStack = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public void push(T item){
        if(size == stack.length){
            resize(stack.length * 2);
        }
        stack[size++] = item;
    }

    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return (T) stack[size - 1];
    }

    public T pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        T item = (T) stack[size - 1];
        size--;
        if(size == stack.length / 4 && size > 0){
            resize(stack.length / 2);
        }
        return item;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = size - 1; i >= 0 ; i--) {
            s.append(stack[i].toString());
            s.append(", ");
        }
        return s.toString();
    }
}

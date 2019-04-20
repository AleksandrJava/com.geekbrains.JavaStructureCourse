package Lesson3;

import java.util.NoSuchElementException;

public class MyArrayQueue<T> {
    private Object[] queue = new Object[1];
    private int size = 0;
    private int start = 0;
    private int end = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void resize(int capacity){
        Object[] newQueue = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(start + i) %queue.length];
        }
        queue = newQueue;
        start = 0;
        end = size;
    }

    public void enqueue(T item){
        if(size == queue.length){
            resize(queue.length * 2);
        }
        queue[end++] = item;
        end %= queue.length;
        size++;
    }

    public T dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        T item = (T) queue[start];
        size--;
        start++;
        start %= queue.length;
        if(size == queue.length / 4 && size > 0){
            resize(queue.length / 2);
        }
        return item;
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return (T) queue[start];
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            s.append((queue[start + 1 % queue.length]).toString());
            s.append(", ");
        }
        return s.toString();
    }
}

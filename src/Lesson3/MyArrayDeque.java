package Lesson3;

import java.util.NoSuchElementException;

public class MyArrayDeque<T> {
    private Object[] deque = new Object[1];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insertLeft(T item){
        Object[] newDeque;
        if(size == deque.length || (size-deque.length == 1)){
            newDeque = new Object[deque.length * 2];
        } else {
            newDeque = new Object[deque.length];
        }

        for (int i = 0; i < size; i++) {
            newDeque[i+1] = deque[i];
        }
        newDeque[0] = item;
        deque = newDeque;
        size++;
    }

    public void insertRight(T item){
        Object[] newDeque;
        if(size == deque.length || (size-deque.length == 1)){
            newDeque = new Object[deque.length * 2];
        } else {
            newDeque = new Object[deque.length];
        }
        for (int i = 0; i < size; i++) {
            newDeque[i] = deque[i];
        }
        newDeque[size++] = item;
        deque = newDeque;
    }

    public T removeLeft(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T item = (T) deque[0];
        size--;
        Object[] newDeque;
        if(size == deque.length/4 && size > 0){
            newDeque = new Object[deque.length / 2];
        } else {
            newDeque = new Object[deque.length];
        }
        for (int i = 0; i < size; i++) {
            newDeque[i] = deque[i+1];
        }
        deque = newDeque;
        return item;
    }
    public T removeRight(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T item = (T) deque[size];
        size--;
        Object[] newDeque;
        if(size == deque.length/4 && size > 0){
            newDeque = new Object[deque.length / 2];
        } else {
            newDeque = new Object[deque.length];
        }
        for (int i = 0; i < size; i++) {
            newDeque[i] = deque[i];
        }
        deque = newDeque;
        return item;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size ; i++) {
            s.append(((T) deque[i]).toString());
            s.append(", ");
        }
        return s.toString();
    }




}
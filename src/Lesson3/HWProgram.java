package Lesson3;

//1. Реализовать рассмотренные структуры данных в консольных программах.
//2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
//3. Создать класс для реализации дека.

public class HWProgram {
    public static void main(String[] args) {

        MyArrayStack<Character> stack = new MyArrayStack<>();

        String str = ".esruoc erutcurtS AVAJ ni nossel driht yM";

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
        MyArrayDeque<Character> deque = new MyArrayDeque<>();

        deque.insertLeft('b');
        deque.insertLeft('a');
        deque.insertRight('c');
        deque.insertLeft('d');
        deque.removeLeft();
        deque.removeRight();
        deque.insertLeft('k');
        deque.insertRight('p');
        deque.insertLeft('t');
        System.out.println(deque);



    }
}

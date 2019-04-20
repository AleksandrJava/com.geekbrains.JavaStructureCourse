package Lesson2;

//Повторить реализацию АТД «список» с помощью структуры данных «массив»

//Провести эксперимент по сравнению эффективности алгоритмов сортировки:
//a) заполнить список случайными N целыми числами в диапазоне от a до b;
//b) запустить алгоритмы сортировки, засекая время их выполнения;
//c) повторить эксперимент M раз;
//d) данные вывести в таблицe.

import java.util.Iterator;
import java.util.Random;

public class Programm {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();
        MyArrayList<Integer> list3 = new MyArrayList<>();
        MyArrayList<Integer> list4 = new MyArrayList<>();

//        list.add('x');
//        list.add('e');
//        list.add('f');
//        list.add('k');
//        System.out.println(list.getSize());
//        System.out.println(list);
//        System.out.println(list.get(2));
//        list.set(2, 'r');
//        System.out.println(list);
//        System.out.println(list.indexOfElement('c'));
//        System.out.println(list.indexOfElement('d'));
//        list.remove('b');
//        System.out.println(list.getSize());
//        System.out.println(list);
//        System.out.println("_____________");
        /*Iterator<Character> iter = list.iterator();
        while (iter.hasNext()) {
            Character c = iter.next();
            System.out.print(c + ", ");
        }
        for (Character c:
             list) {
            System.out.print(c + ", ");
        }*/

//        list.insertionSort(new CharCmp());
//        System.out.println(list);

        int N = 10000;
        Random r = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        for (int i = 0; i < N; i++) {
            int result = r.nextInt(upperBound-lowerBound) + lowerBound;
            list1.add(result);
            list2.add(result);
            list3.add(result);
            list4.add(result);
        }
        System.out.println("Номер эксперимента: 1");

        long start1 = System.currentTimeMillis();
        list1.SelectionSort(new CharCmp());
        System.out.println("Сортировка выборкой 1 " + (System.currentTimeMillis() - start1));

        long start2 = System.currentTimeMillis();
        list2.insertionSort(new CharCmp());
        System.out.println("Сортировка вставкой 1 " + (System.currentTimeMillis() - start2));

        System.out.println("Номер эксперимента: 2");

        long start3 = System.currentTimeMillis();
        list3.SelectionSort(new CharCmp());
        System.out.println("Сортировка выборкой 2 " + (System.currentTimeMillis() - start3));

        long start4 = System.currentTimeMillis();
        list4.insertionSort(new CharCmp());
        System.out.println("Сортировка вставкой 2 " + (System.currentTimeMillis() - start4));



    }
}

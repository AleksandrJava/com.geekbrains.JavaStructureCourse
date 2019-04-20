package Lesson5;

//1. Написать программу по возведению числа в степень с помощью рекурсии и с помощью циклического оператора.
//2. Познакомиться с головоломкой Ханойские башни.
//Реализовать рекурсивный и циклический алгоритмы решения этой головоломки.

public class Program {
    public static void main(String[] args) {
        System.out.println(exponentiation(5,3));
        hanoiTower(4,1,2,3 );
    }

    public static int exponentiationRec(int a, int b){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }
        return exponentiationRec(a, b-1);
    }


    public static int exponentiation(int a, int b){
        int exp = 1;
        while(b > 0) {
            if (b % 2 == 0) {
                b = b / 2;
                a = a * a;
            } else {
                b--;
                exp *= a;
            }
        }
        return exp;
    }
    public static void hanoiTower( int n, int from, int to, int additional){
        if ( n == 0 ) {
            return;
        }

        hanoiTower(n - 1, from, additional, to );

        System.out.println( "№" + n + " Со стержня  " + from + " на стержень " + to );

        hanoiTower(n - 1, additional, to, from );

    }
}

package lambdas;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();


        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> System.out.println(n));
    }

    public static int someMethod() {
        return 1;
    }
}
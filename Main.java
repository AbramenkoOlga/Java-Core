package Homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static void changeArrElements(Object[] array, int a, int b){
        System.out.println(Arrays.toString(array));
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}

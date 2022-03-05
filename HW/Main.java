package HW;

import HW.fruits.Apple;
import HW.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"qwe","as","zx"};

        ArrayList<String> al = arrayToList(arr);
        System.out.println(al);

        BoxWithFruits<Orange> box1 = new BoxWithFruits<>();
        box1.add(new Orange());

    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> void swap1(T[] arr, int index1, int index2 ){
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }

}

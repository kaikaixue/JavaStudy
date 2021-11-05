package top.xkk.java.basic.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericsWildcardDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
//        List<Number> numList = intList; // Error
        List<? extends Integer> intList2 = new ArrayList<>();
        List<? extends Number> numList2 = intList2; // OK
    }
}

package top.xkk.java.basic.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericVarargsMethodDemo {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        Collections.addAll(result, args);
        return result;
    }
    public static void main(String[] args) {
        List<String> ls = makeList("x");
        System.out.println(ls);
        ls = makeList("x", "k", "k");
        System.out.println(ls);
    }
}

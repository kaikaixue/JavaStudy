package top.xkk.java.basic.generics;

public class GenericsClassDemo02 {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>(20, "xkk");
        System.out.println(map);
    }
}

package top.xkk.java.basic.generics;

public class GenericsClassDemo03 {
    public static void main(String[] args) {
        Info<String> info = new Info("xkk");
        MyMap<Integer, Info<String>> map = new MyMap<>(20, info);
        System.out.println(map);
    }
}

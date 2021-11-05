package top.xkk.java.basic.generics;

public class GenericsClassDemo01 {
    public static void main(String[] args) {
        Info<Integer> info = new Info<>();
        info.setValue(20);
        System.out.println(info.getValue());
        Info<String> info2 = new Info<>();
        info2.setValue("xkk");
        System.out.println(info2.getValue());
    }
}

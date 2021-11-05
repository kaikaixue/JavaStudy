package top.xkk.java.basic.generics;

public class GenericsInterfaceDemo01 implements Content<Integer> {
    private final int text;
    public GenericsInterfaceDemo01(int text) {
        this.text = text;
    }
    @Override
    public Integer text() { return text; }
    public static void main(String[] args) {
        GenericsInterfaceDemo01 demo = new GenericsInterfaceDemo01(20);
        System.out.print(demo.text());
    }
}

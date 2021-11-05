package top.xkk.java.basic.generics;

public class GenericsInterfaceDemo02<T> implements Content<T> {
    private final T text;
    public GenericsInterfaceDemo02(T text) {
        this.text = text;
    }
    @Override
    public T text() { return text; }
    public static void main(String[] args) {
        GenericsInterfaceDemo02<String> gen = new GenericsInterfaceDemo02<>
                ("xkk");
        System.out.print(gen.text());
    }
}

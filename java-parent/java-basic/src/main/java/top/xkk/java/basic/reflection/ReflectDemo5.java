package top.xkk.java.basic.reflection;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("Class.txt"));

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> clazz = Class.forName(className);
        Method method = clazz.getMethod(methodName);
        method.invoke(clazz.getDeclaredConstructor().newInstance());
    }
}

package top.xkk.java.basic.reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@Slf4j
public class ReflectDemo4 {
    public static void main(String[] ages) throws Exception {
        Class<?> clazz = Class.forName("top.xkk.java.basic.reflection.Student");

        // 通过反射获取注解
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            log.info("注解的值： {}", annotation);
        }

        // 获得注解value的值
        TableSu tableSu = clazz.getAnnotation(TableSu.class);
        String value = tableSu.value();
        log.info("注解的值: {}", value);

        // 获得类指定的注解
        Field field = clazz.getDeclaredField("name");
        FieldSu annotation = field.getAnnotation(FieldSu.class);
        log.info("name: {}", annotation.columnName());
        log.info("type: {}", annotation.type());
        log.info("length: {}", annotation.length());
    }
}

package top.xkk.java.basic.serialize;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static final long serialVersionUID = -1576643344804979563L;

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static synchronized Singleton getSingleton() {
        return SingletonHolder.singleton;
    }
}

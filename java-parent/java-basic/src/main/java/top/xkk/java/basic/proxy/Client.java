package top.xkk.java.basic.proxy;

public class Client {
    public static void main(String[] args) {
        //真实⻆⾊
        UserService userService = new UserServiceImpl();
        //代理⻆⾊
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调⽤程序处理⻆⾊来处理我们要调⽤的接⼝对象
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.update();
    }
}

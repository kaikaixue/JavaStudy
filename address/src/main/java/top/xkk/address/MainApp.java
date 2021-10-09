package top.xkk.address;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import top.xkk.address.model.Person;
import top.xkk.address.view.PersonController;

import java.io.IOException;
import java.time.LocalDate;

public class MainApp extends Application {
    private final ObservableList<Person> personData = FXCollections.observableArrayList();

    public MainApp() {
        personData.add(new Person("王林", "软件2026", "男", "江苏南京",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img12.jpg")));
        personData.add(new Person("彭海洋", "软件2026", "男", "江苏扬州",
                LocalDate.of(1999, 10, 24), new Image("https://images.unsplash.com/photo-1633099702771-ce69a3ebb7bf?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzc5MTE5MA&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("郭佳", "软件2026", "女", "江苏苏州",
                LocalDate.of(2001, 11, 24), new Image("https://images.unsplash.com/photo-1632984512706-029f5e57e6fd?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzc5MTEzNA&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("黄志伟", "软件2026", "男", "江苏泰州",
                LocalDate.of(2000, 10, 24), new Image("https://images.unsplash.com/photo-1631415323509-7e870d79cabc?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=300&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzMzc5MTM1OQ&ixlib=rb-1.2.1&q=80&w=300")));
        personData.add(new Person("张珂", "软件2026", "女", "江苏徐州",
                LocalDate.of(2001, 9, 11), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img14.jpg")));
        personData.add(new Person("赵丹", "软件2036", "女", "江苏南通",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img15.jpg")));
        personData.add(new Person("张建凤", "软件2036", "女", "江苏无锡",
                LocalDate.of(2001, 2, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img16.jpg")));
        personData.add(new Person("杨阳", "软件2026", "男", "江苏南京",
                LocalDate.of(2000, 10, 23), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img17.jpg")));
        personData.add(new Person("尚宇驰", "软件2026", "女", "江苏徐州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img20.jpg")));
        personData.add(new Person("陈蓉琪", "软件2026", "女", "江苏南京",
                LocalDate.of(2000, 3, 21), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img19.jpg")));
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("view/person.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 980, 600);
        PersonController controller = fxmlLoader.getController();
        controller.setMainApp(this);
        stage.setTitle("AddressBook");
        stage.setScene(scene);
        stage.show();
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public static void main(String[] args) {
        launch();
    }
}
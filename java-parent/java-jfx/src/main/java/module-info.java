module com.example.java.jfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.github.oshi;
    requires fastjson;

    requires java.desktop;

//    requires javafx.web;

    opens com.example.java.jfx.util to javafx.fxml;
    exports com.example.java.jfx.util;

    opens com.example.java.jfx.ctrl to javafx.fxml;
    exports com.example.java.jfx;

    opens com.example.java.jfx.layout to javafx.fxml;
    exports com.example.java.jfx.layout;

    opens com.example.java.jfx.basic to javafx.fxml;
    exports com.example.java.jfx.basic;

    opens com.example.java.jfx.effect to javafx.fxml;
    exports com.example.java.jfx.effect;

    opens com.example.java.jfx.basic.trayicon to javafx.fxml;
    exports com.example.java.jfx.basic.trayicon;

    opens com.example.java.jfx.basic.animate to javafx.fxml;
    exports com.example.java.jfx.basic.animate;

    opens com.example.java.jfx.basic.control to javafx.fxml;
    exports com.example.java.jfx.basic.control;
}
module top.xkk.chat.ui {
    requires javafx.fxml;
    requires javafx.controls;

    opens top.xkk.chat.ui to javafx.fxml;
    exports top.xkk.chat.ui;
}
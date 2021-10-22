module top.xkk.chat.ui {
    requires javafx.fxml;
    requires javafx.controls;

    opens top.xkk.chat.ui to javafx.fxml;
    exports top.xkk.chat.ui;

    opens top.xkk.chat.ui.view to javafx.fxml;
    exports top.xkk.chat.ui.view;

    opens top.xkk.chat.ui.view.login to javafx.fxml;
    exports top.xkk.chat.ui.view.login;

    opens top.xkk.chat.ui.view.chat to javafx.fxml;
    exports top.xkk.chat.ui.view.chat;
}
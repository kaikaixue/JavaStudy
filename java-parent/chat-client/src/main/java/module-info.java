module top.xkk.chat.client {
    requires top.xkk.chat.ui;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;
    requires lombok;
    requires chat.server.agreement;
    requires io.netty.all;
    requires fastjson;

    opens top.xkk.chat.client to javafx.fxml;
    exports top.xkk.chat.client;
}
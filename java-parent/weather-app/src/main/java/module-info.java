module top.xkk.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens top.xkk.weather to javafx.fxml;
    exports top.xkk.weather;

    opens top.xkk.weather.view to javafx.fxml;
    exports top.xkk.weather.view;

    exports top.xkk.weather.util;
}
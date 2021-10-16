module top.xkk.linechart {
    requires javafx.controls;
    requires javafx.fxml;

    opens top.xkk.linechart to javafx.fxml;
    exports top.xkk.linechart;

    opens top.xkk.linechart.view to javafx.fxml;
    exports top.xkk.linechart.view;
}
module top.xkk.notepad {
    requires javafx.controls;
    requires javafx.fxml;

    opens top.xkk.notepad to javafx.fxml;
    exports top.xkk.notepad;

    opens top.xkk.notepad.view to javafx.fxml;
    exports top.xkk.notepad.view;
}
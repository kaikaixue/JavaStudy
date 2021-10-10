package top.xkk.address.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import top.xkk.address.MainApp;
import top.xkk.address.model.Person;
import top.xkk.address.util.DateUtil;

public class PersonEditController {
    private Stage editStage;

    private MainApp mainApp;

    @FXML
    private TextField nameField;

    @FXML
    private TextField clazzField;

    @FXML
    private RadioButton maleButton;

    @FXML
    private RadioButton femaleButton;

    @FXML
    private ToggleGroup group;

    @FXML
    private TextField addressField;

    @FXML
    private TextField birthdayField;

    @FXML
    private TextField avatarField;

    @FXML
    private void initialize() {

    }

    public void setEditStage(Stage editStage) {
        this.editStage = editStage;
    }


    public void handleSubmit(ActionEvent actionEvent) {
        Person person = new Person();
        person.setName(nameField.getText());
        person.setClazz(clazzField.getText());
        person.setAddress(addressField.getText());
        person.setAvatar(new Image(avatarField.getText()));
        person.setBirthday(DateUtil.parse(birthdayField.getText()));
        // 性别
        if (maleButton.isSelected()) {
            person.setGender("男");
        } else {
            person.setGender("女");
        }
//        group.selectedToggleProperty().addListener((ov,oldVal,newVal) -> {
//            person.setGender(group.getSelectedToggle().getUserData().toString());
//        });
        mainApp.getPersonData().add(person);
        editStage.close();
        mainApp.getStage().setIconified(false);
    }

    public void handleCancel(ActionEvent actionEvent) {
        editStage.close();
        mainApp.getStage().setIconified(false);
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}

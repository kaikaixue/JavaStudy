package top.xkk.address.view;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import top.xkk.address.MainApp;
import top.xkk.address.config.AppConstant;
import top.xkk.address.model.Person;
import top.xkk.address.util.DateUtil;

import java.time.LocalDate;

public class PersonController {
    @FXML
    private TableView<Person> personTable;

    @FXML
    private FilteredList<Person> filteredDate;

    @FXML
    private TableColumn<Person, String> nameColumn;

    @FXML
    private TableColumn<Person, String> clazzColumn;

    @FXML
    private TableColumn<Person, String> genderColumn;

    @FXML
    private Label nameLabel;

    @FXML
    private Label clazzLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label addressLabel;

    @FXML
    private Label birthdayLabel;

    @FXML
    private ImageView avatar;

    @FXML
    private MainApp mainApp;

    @FXML
    private TextField inputField;

    public PersonController() {

    }

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(CellData -> CellData.getValue().nameProperty());
        clazzColumn.setCellValueFactory(CellData -> CellData.getValue().clazzProperty());
        genderColumn.setCellValueFactory(CellData -> CellData.getValue().genderProperty());
        showPersonDetails(null);
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonDetails(newValue)
        );
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        ObservableList<Person> personData = mainApp.getPersonData();
//        personTable.setItems(personData);
        FilteredList<Person> filteredData = new FilteredList<>(personData, p -> true);
        inputField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(person -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                return person.getName().toLowerCase().contains(lowerCaseFilter)
                        || person.getClazz().toLowerCase().contains(lowerCaseFilter)
                        || person.getGender().toLowerCase().contains(lowerCaseFilter)
                        || person.getAddress().toLowerCase().contains(lowerCaseFilter);
            });
        });
        personTable.setItems(filteredData);
    }

    /**
     * ????????????
     */
    public void showPersonDetails(Person person) {
        if (person != null) {
            nameLabel.setText(person.getName());
            clazzLabel.setText(person.getClazz());
            genderLabel.setText(person.getGender());
            addressLabel.setText(person.getAddress());
            birthdayLabel.setText(DateUtil.format(person.getBirthday()));
            avatar.setImage(person.getAvatar());
        } else {
            nameLabel.setText("");
            clazzLabel.setText("");
            genderLabel.setText("");
            addressLabel.setText("");
            birthdayLabel.setText("");
            avatar.setImage(new Image("https://train-homework.oss-cn-shanghai.aliyuncs.com/avatar/default_avatar.jpg"));
        }
    }

    /**
     * ????????????
     */
    public void handleDeletePerson() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            mainApp.getPersonData().remove(selectedIndex);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("??????");
            a.setHeaderText("????????????");
            a.setContentText("??????????????????????????????");
            a.showAndWait();
        }
    }

    /**
     * ????????????
     */
    public void handleSearchPerson() {
//        String keywords = inputField.getText().trim();
//        ObservableList<Person> items = personTable.getItems();
//        List<Person> list = items.stream()
//                .filter(p -> p.getName().contains(keywords) || p.getClazz().contains(keywords))
//                .collect(Collectors.toList());
//        if (list.size() != 0) {
//            personTable.setItems(FXCollections.observableList(list));
//            showPersonDetails(list.get(0));
//        }
//        inputField.setText("");
    }


    // ??????
    public void reset(ActionEvent actionEvent) {
        ObservableList<Person> personData = mainApp.getPersonData();
        personTable.setItems(personData);
    }

    /**
     * ????????????
     */
    public void handleNewPerson() {
        Person tempPerson = new Person(
                "xkk", "??????2020", "???", "????????????", LocalDate.of(2002, 11, 11), new Image("https://train-homework.oss-cn-shanghai.aliyuncs.com/avatar/default_avatar.jpg")
                );
        mainApp.showEditPerson(tempPerson, AppConstant.NEW_PERSON);
    }

    /**
     * ????????????
     */
    public void handleEditPerson() {
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            mainApp.showEditPerson(selectedPerson, AppConstant.EDIT_PERSON);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("??????");
            a.setHeaderText("????????????");
            a.setContentText("??????????????????????????????");
            a.showAndWait();
        }
    }
}
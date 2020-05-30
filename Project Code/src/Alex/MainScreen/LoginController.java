package Alex.MainScreen;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    private String hrConnect = "HR";
    private String csConnect = "CR";
    private String logisticsConnect = "LG";
    private String itConnect = "IT";
    private String chooseDepartment;


    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton exitButton;

    @FXML
    private Label logInFail;

    @FXML
    private ComboBox<String> comboBox;


    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void logInAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        MainScreenController mainScreenController = fxmlLoader.getController();
        //MainScreenController.initEmployee(Employee(username.getText())),;

        Stage stage = new Stage();
        stage.setTitle("Recruiter");
        stage.setScene(new Scene(root1));
        stage.show();
        Stage logInWindow = (Stage) login.getScene().getWindow();
        logInWindow.close();
    }

}

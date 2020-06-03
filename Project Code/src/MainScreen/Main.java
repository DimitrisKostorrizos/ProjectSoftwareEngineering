package MainScreen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            primaryStage.setTitle("COMCOP");
            primaryStage.getIcons().add(new Image("file:Project Code/src/img/logo.png"));
        primaryStage.setScene(new Scene(root, 850, 600));
        primaryStage.show();
        //SidebarController.initEmployee(employeeLogistics());
        //SidebarController.initProfile(logisticsProfile(employeeLogistics()));


    }



    public static void main(String[] args) {
        launch(args);
}}

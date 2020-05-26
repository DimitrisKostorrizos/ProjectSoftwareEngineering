package Dimitris.ToDoListFeatures;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainTo extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("ToDoListCompositionScreen.fxml"));
        primaryStage.setTitle("CompositionScreen");
        primaryStage.setScene(new Scene(root, 850, 600));
        primaryStage.show();
    }
}

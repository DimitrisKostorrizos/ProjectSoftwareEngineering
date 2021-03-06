package ChatScreen;

import MainScreen.SidebarController;
import ProfileFeatures.ChatFeature;
import ProfileFeatures.Employee;
import ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatScreenController {

        @FXML
        private BorderPane borderPane;

        @FXML
        private Button NewGroupChatButton;

        @FXML
        private Label User1chat;

        @FXML
        private ImageView Avatar1;

        @FXML
        private Label User2chat;

        @FXML
        private ImageView Avatar2;

        @FXML
        private Label User3chat;

        @FXML
        private ImageView Avatar3;

        @FXML
        private Label User4chat;

        @FXML
        private ImageView Avatar4;

        @FXML
        private Label User5chat;

        @FXML
        private ImageView Avatar5;

        @FXML
        private Label User6chat;

        @FXML
        private ImageView Avatar6;

        @FXML
        private Button CallButton;

        @FXML
        void beginCall(ActionEvent event) {
                Parent root;
                try {
                        ResourceBundle resources=null;
                        root = FXMLLoader.load(getClass().getClassLoader().getResource("CallScreen.fxml"), resources);
                        Stage stage = new Stage();
                        stage.setTitle("Call");
                        stage.setScene(new Scene(root, 450, 450));
                        stage.show();
                        // Hide this current window (if this is what you want)
                        ((Node)(event.getSource())).getScene().getWindow().hide();
                        //CallScreenController.initData();
                }
                catch (IOException e) {
                        e.printStackTrace();
                }

        }


        private static Employee username;
        private static Profile profile;
        Profile dummyprofile1;
        Profile dummyprofile2;
        Profile dummyprofile3;
        Profile dummyprofile4;
        Profile dummyprofile5;
        Profile dummyprofile6;


        public void initEmployee(Employee x, Profile y) {
                profile=y;
                username=x;

                dummyprofile1=new Profile("Dummy User 1","Project Code/src/ChatScreen/image8.jpg");
                dummyprofile2=new Profile("Dummy User 2","Project Code/src/ChatScreen/image9.jpg");
                dummyprofile3=new Profile("Dummy User 3","Project Code/src/ChatScreen/image10.jpg");
                dummyprofile4=new Profile("Dummy User 4","Project Code/src/ChatScreen/image11.jpg");
                dummyprofile5=new Profile("Dummy User 5","Project Code/src/ChatScreen/image12.jpg");
                dummyprofile6=new Profile("Dummy User 6","Project Code/src/ChatScreen/image13.jpg");
                Avatar1.setImage(dummyprofile1.getPhoto());
                Avatar2.setImage(dummyprofile2.getPhoto());
                Avatar3.setImage(dummyprofile3.getPhoto());
                Avatar4.setImage(dummyprofile4.getPhoto());
                Avatar5.setImage(dummyprofile5.getPhoto());
                Avatar6.setImage(dummyprofile6.getPhoto());
                User1chat.setText(dummyprofile1.getName());
                User2chat.setText(dummyprofile2.getName());
                User3chat.setText(dummyprofile3.getName());
                User4chat.setText(dummyprofile4.getName());
                User5chat.setText(dummyprofile5.getName());
                User6chat.setText(dummyprofile6.getName());
        }


        @FXML
        void pressed1(MouseEvent event) {

                Parent root = null;

                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MessageScreen.fxml"));
                        root = (Parent) fxmlLoader.load();
                        MessageScreenController messageScreenController = fxmlLoader.getController();
                        List<Profile> dummyChat =new ArrayList<>();
                        dummyChat.add(profile);
                        dummyChat.add(dummyprofile1);
                        ChatFeature chats= new ChatFeature(dummyChat);
                        messageScreenController.initData(username,profile,chats);

                } catch (IOException ex) {
                        Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
                }
                borderPane.setCenter(root);

        }

        @FXML
        void pressed2(MouseEvent event) {
                goToChat(dummyprofile2);
        }

        @FXML
        void pressed3(MouseEvent event) {
                goToChat(dummyprofile3);
        }

        @FXML
        void pressed4(MouseEvent event) {
                goToChat(dummyprofile4);
        }

        @FXML
        void pressed5(MouseEvent event) {
                goToChat(dummyprofile5);
        }

        @FXML
        void pressed6(MouseEvent event) {
                goToChat(dummyprofile6);
        }
        void goToChat(Profile x) {
                //Profile otherProfile=x ;
                 /*Label sourceLabel = (Label) event.getSource();
                if (sourceLabel==User1chat)
                {
                        otherProfile=dummyprofile1;
                }
               else if(sourceLabel==User2chat){otherProfile=dummyprofile2;}
                else if(sourceLabel==User3chat){otherProfile=dummyprofile3;}
                else if(sourceLabel==User4chat){otherProfile=dummyprofile4;}
                else if(sourceLabel==User5chat){otherProfile=dummyprofile5;}
                else if(sourceLabel==User6chat){otherProfile=dummyprofile6;}*/



                Parent root = null;

                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MessageScreen.fxml"));
                        root = (Parent) fxmlLoader.load();
                        MessageScreenController messageScreenController = fxmlLoader.getController();
                        List<Profile> dummyChat =new ArrayList<>();
                        dummyChat.add(profile);
                        dummyChat.add(x);
                        ChatFeature chats= new ChatFeature(dummyChat);
                        messageScreenController.initData(username,profile,chats);

                } catch (IOException ex) {
                        Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
                }
                borderPane.setCenter(root);

        }







}



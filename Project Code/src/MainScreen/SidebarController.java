package MainScreen;

import CustomerDepartment.CustomerSupportSideBarController;
import LogisticsDepartmentScreens.LogisticsDepartmentScreenController;
import ProfileFeatures.Employee;
import ProfileFeatures.Profile;
import ProfileScreen.ProfileScreenController;
import SearchResults.SearchResultsController;
import Apothetirio.ApothetirioController;
import TechnicalSupportDepartmentEmployeeFeatures.TechnicalSupportEmployeeFeaturesScreenController;
import ToDoListFeatures.ToDoListCompositionScreenController;
import HRDepartment.HRDepartmentSidebarController;
import com.gluonhq.charm.glisten.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SidebarController {
    @FXML
    private  BorderPane borderPanee;
    @FXML
    private TextField SearchBar;

    @FXML
    private Button BeginSearchButton;

    @FXML
    private Button MainPageButton;

    @FXML
    private Button RepositoryButton;

    @FXML
    private Button MyProfileButton;

    @FXML
    private static Button DepartmentButton;

    private  static Employee username;
    private static Profile profile;
    private static Employee dummy;

    public static void initData(Employee x,Profile y) {
        username=x;
        profile=y;
      /*  if(x.belongsToDepartment(Employee.department.none))
            DepartmentButton.setVisible(false);*/
    }



    @FXML
    void openRepository(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Apothetirio/ApothetirioSample.fxml"));
            root = (Parent) fxmlLoader.load();
            ApothetirioController apothetirioController = fxmlLoader.getController();

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }

    @FXML
    void Search(ActionEvent event) {
        String  query=SearchBar.getText();
        //Δημιουργουμε ενα dummy user με ονομα το search query για τις αναγκες της εργασιας και της επιδειξης της βασικης λειτουργικοτητας
        Employee dummy = new Employee (query, Employee.department.none);
        Profile dummyProfile=new Profile(dummy,"Project Code/src/ProfileScreen/image7.jpg",2500);

        dummyProfile.setPosition("Cleaning Staff");

        dummyProfile.setContactInfo("Πρόκειται για dummy προφίλ \nπου δημιουργείται με όνομα το query \nτης αναζήτησης για τις ανάγκες της εργασίας \nκαι της επίδειξης της βασικής λειτουργικότητας.");


        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/SearchResults/SearchResultsScreen.fxml"));
            root = (Parent) fxmlLoader.load();
            SearchResultsController searchResultsController = fxmlLoader.getController();
            searchResultsController.initSearchResults(username,profile,dummy,dummyProfile);


        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }

    @FXML
    void goToMainPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
            root = (Parent) fxmlLoader.load();
           MainScreenController mainScreenController = fxmlLoader.getController();
           mainScreenController.initEmployee(username,profile);

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }




    @FXML
    void goToMyProfile(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ProfileScreen/ProfileScreen.fxml"));
            root = (Parent) fxmlLoader.load();
            ProfileScreenController profileScreenController = fxmlLoader.getController();
            profileScreenController.initEmployeeFromMyProfile(username,profile);

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }
    @FXML
    void goToMyDepartment(ActionEvent event) {
        Parent root =null;
        switch(username.getDepartment()){
            case Logistics:
                root = null;
                try{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LogisticsDepartmentScreens/LogisticsScreen.fxml"));
                    root = (Parent) fxmlLoader.load();
                    LogisticsDepartmentScreenController logisticsDepartmentScreenController = fxmlLoader.getController();
                    logisticsDepartmentScreenController.setVariables(username,profile);}
                catch (IOException ex) {
                    Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

                }
                borderPanee.setCenter(root);
                break;
            case HR:
                try{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/HRDepartment/HRDepartmentSideBar.fxml"));
                    root = (Parent) fxmlLoader.load();
                    HRDepartmentSidebarController hrDepartmentSidebarController = fxmlLoader.getController();
                }
                catch (IOException ex) {
                    Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

                }
                borderPanee.setCenter(root);
                break;
            case CostumerSupport:
                try{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/CustomerDepartment/CustomerSupportSideBar.fxml"));
                    root = (Parent) fxmlLoader.load();
                    CustomerSupportSideBarController customerSupportSideBarController = fxmlLoader.getController();
                }
                catch (IOException ex) {
                    Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

                }
                borderPanee.setCenter(root);
                break;
            case TechnicalSupport:
                try{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/TechnicalSupportDepartmentEmployeeFeatures/TechnicalSupportEmployeeFeaturesScreen.fxml"));
                    root = (Parent) fxmlLoader.load();
                    TechnicalSupportEmployeeFeaturesScreenController technicalSupportEmployeeFeaturesScreenController = fxmlLoader.getController();
                }
                catch (IOException ex) {
                    Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

                }
                borderPanee.setCenter(root);
                break;




        }
    }
}



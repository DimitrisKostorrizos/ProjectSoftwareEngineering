package ProfileFeatures;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;

public class Profile {
    private String fullname;
    private Employee.department dpt;
    private String position;
    private long salary;
    //private ArrayList< MonthlyReview> monthlyReviews = new ArrayList< MonthlyReview>();
    private LocalDate startDate;
    private Image photo ;
    private Employee user;
    private String contactInfo;

    public Profile returnInfo(Profile x){
        return x;
    }

    public void setUser(Employee x) {
        this.user=x;
        this.fullname=x.getName();
        this.dpt=x.getDepartment();

    }

    public void setDate(LocalDate date) {
       startDate= date;
    }

    public void setSalary (long i) {
        this.salary=i;
    }

    public String getName() {
        return fullname;
    }

    public String getContact() {
        return contactInfo;
    }

    public Employee.department getDepartment() {
        return dpt;
    }



    public LocalDate getDate() {
       return startDate;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public long getSalary() {
        return salary;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(String location){
        Image image = null;
            try {
        image = new Image(new FileInputStream(location));
    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    }
            this.photo = image;
    }
    public Profile(String name, String location){
        this.fullname=name;
        setPhoto(location);
    }
    public Profile(Employee users, String location, long money){
        setUser(users);
        setPhoto(location);
        this.salary=money;
    }
}

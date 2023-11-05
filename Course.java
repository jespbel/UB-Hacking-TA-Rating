import java.util.ArrayList;
public class Course {
    private String courseName;
    private ArrayList<TA> staff;

    public Course (String courseName, ArrayList<TA> Staff){
        this.courseName = courseName;
        this.staff = Staff;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<TA> getStaff() {
        return this.staff;
    }

    public void setStaff(ArrayList<TA> staff) {
        this.staff = staff;
    }
}

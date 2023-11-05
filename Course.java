import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<String, TA> staff;

    public Course (String courseName){
        this.courseName = courseName;
        this.staff = new HashMap<>();
    }

    public void addStaff(TA ta){
        staff.put(ta.name, ta);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public HashMap<String, TA> getStaff() {
        return this.staff;
    }

    public void setStaff(HashMap<String, TA> staff) {
        this.staff = staff;
    }
}

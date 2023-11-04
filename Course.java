import java.util.ArrayList;
public class Course {
    private String name;
    private ArrayList<TA> staff;

    public Course (String name, ArrayList<TA> Staff){
        this.name = name;
        this.staff = Staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TA> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<TA> staff) {
        this.staff = staff;
    }
}

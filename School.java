import java.util.ArrayList;
import java.util.HashMap;

public class School {



    public HashMap<String, Course> Courses;

    public School() {
        this.Courses = new HashMap<>();
    }

    public void addCourse(Course course){
        if (this.Courses.containsKey(course.getCourseName())){
            return;
        }
        this.Courses.put(course.getCourseName(), course);
    }
}

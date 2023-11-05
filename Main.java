import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // An idiot admires comlexity, and genius admires simplicity.
        //Daddy Yeager
        //-Daddy Yeage
        School UB = new School();
        while (true != false) {
            rateMyTA(UB);
        }
        // I am vengeance
    }
    public static void rateMyTA(School school) {

        System.out.println("Choose course");
        for (Map.Entry <String, Course> entry : school.Courses.entrySet()){
            System.out.println(entry.getKey());
        }
        Scanner courseInput = new Scanner(System.in);
        String course = courseInput.nextLine();

        if (!school.Courses.containsKey(course)){
            Course newCourse = new Course(course);
            school.addCourse(newCourse);
        }

        System.out.println("Choose TA");
        for (String ta: school.Courses.get(course).getStaff().keySet()) {
            System.out.println(ta);
        }

        Course selectedCourse = school.Courses.get(course);
        String TA = courseInput.nextLine();

        if (!selectedCourse.getStaff().containsKey(TA)){
            System.out.println("Enter TA Name:");
            String name = courseInput.nextLine();
            System.out.println("Enter TA Kindness (1-5):");
            Double kindness = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Punctuality (1-5):");
            Double punctuality = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Passion (1-5):");
            Double passion = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Comedian (1-5):");
            Double comedian = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Knowldedge (1-5):");
            Double knowledge = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Piazza God (1-5):");
            Double pzg = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA OH Dweller (1-5):");
            Double ohd = Double.parseDouble(courseInput.nextLine());
            TA newTA = new TA(name, kindness, punctuality, passion, comedian, knowledge, pzg, ohd);
            selectedCourse.addStaff(newTA);
        }
        TA taObj = selectedCourse.getStaff().get(TA);
        System.out.println("TA Kindness: " + Double.toString(taObj.kindness));
        System.out.println("TA Punctuality: " + Double.toString(taObj.punctuality));
        System.out.println("TA Passion: " + Double.toString(taObj.passion));
        System.out.println("TA Comedian: " + Double.toString(taObj.comedian));
        System.out.println("TA Knowdledge: " + Double.toString(taObj.knowledge));
        System.out.println("TA Piazza God: " + Double.toString(taObj.piazzaGod));
        System.out.println("TA OH Dweller: " + Double.toString(taObj.ohDweller));

        System.out.println("Add Rating y/n");
        String answer = courseInput.nextLine();
        if (answer.compareTo("y") == 0){
            System.out.println("Enter TA Kindness (1-5):");
            Double kindness = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Punctuality (1-5):");
            Double punctuality = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Passion (1-5):");
            Double passion = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Comedian (1-5):");
            Double comedian = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Knowldedge (1-5):");
            Double knowledge = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA Piazza God (1-5):");
            Double pzg = Double.parseDouble(courseInput.nextLine());
            System.out.println("Enter TA OH Dweller (1-5):");
            Double ohd = Double.parseDouble(courseInput.nextLine());
            taObj.addRating(kindness, punctuality, passion, comedian, knowledge, pzg, ohd);
        }


    }
}
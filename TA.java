import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class TA{
    private String name;

    private double totalRatings;

    private double kindness;

    private double punctuality;

    private double passion;

    private double comedian;

    private double knowledge;

    public void computeAverage(ArrayList<Integer> user_input){
        this.totalRatings = this.totalRatings + 1.0;
        this.kindness = (this.kindness/this.totalRatings) + (user_input.get(0)/this.totalRatings);
        this.punctuality = (this.punctuality/this.totalRatings) + (user_input.get(1)/this.totalRatings);
        this.passion = (this.passion/this.totalRatings) + (user_input.get(2)/this.totalRatings);
        this.comedian = (this.comedian/this.totalRatings) + (user_input.get(3)/this.totalRatings);
        this.knowledge = (this.knowledge/this.totalRatings) + (user_input.get(4)/this.totalRatings);
    }
}

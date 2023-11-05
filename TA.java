import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class TA{
    private String name;

    private int totalRatings;

    private double kindness;

    private double punctuality;

    private double passion;

    private double comedian;

    private double knowledge;

    public void computeAverage(ArrayList<Integer> user_input){
        int numberRatings = this.totalRatings + 1;
        this.kindness = (this.kindness/numberRatings) + (user_input.get(0)/numberRatings);
        this.punctuality = (this.punctuality/numberRatings) + (user_input.get(1)/numberRatings);
        this.passion = (this.passion/numberRatings) + (user_input.get(2)/numberRatings);
        this.comedian = (this.comedian/numberRatings) + (user_input.get(3)/numberRatings);
        this.knowledge = (this.knowledge/numberRatings) + (user_input.get(4)/numberRatings);
    }
}

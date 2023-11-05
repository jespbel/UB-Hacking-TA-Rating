import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class TA{
    private String name;

    private double totalRatings;
    private boolean goatBadge;
    private double kindness;
    private boolean kindnessBadge;

    private double punctuality;
    private boolean punctualityBadge;
    private double passion;
    private boolean passionBadge;
    private double comedian;
    private boolean comedianBadge;
    private double knowledge;
    private boolean knowledgeBadge;
    private double piazzaGod;
    private boolean piazzaGodBadge;
    private double ohDweller;
    private boolean ohDwellerBadge;

    public void computeAverage(ArrayList<Integer> user_input){
        this.totalRatings = this.totalRatings + 1.0;
        this.kindness = (this.kindness/this.totalRatings) + (user_input.get(0)/this.totalRatings);
        this.punctuality = (this.punctuality/this.totalRatings) + (user_input.get(1)/this.totalRatings);
        this.passion = (this.passion/this.totalRatings) + (user_input.get(2)/this.totalRatings);
        this.comedian = (this.comedian/this.totalRatings) + (user_input.get(3)/this.totalRatings);
        this.knowledge = (this.knowledge/this.totalRatings) + (user_input.get(4)/this.totalRatings);
        this.piazzaGod = (this.piazzaGod/this.totalRatings) + (user_input.get(5)/this.totalRatings);
        this.ohDweller = (this.ohDweller/this.totalRatings) + (user_input.get(6)/this.totalRatings);
    }
    public void computeBadge(){
        if (this.kindness >= 4.0) {
            this.kindnessBadge = true;
        } else {
            this.kindnessBadge = false;
        }
        if (this.punctuality >= 4.0) {
            this.punctualityBadge = true;
        } else {
            this.punctualityBadge = false;
        }
        if (this.passion >= 4.0) {
            this.passionBadge = true;
        } else {
            this.passionBadge = false;
        }
        if (this.comedian >= 4.0) {
            this.comedianBadge = true;
        } else {
            this.comedianBadge = false;
        }
        if (this.knowledge >= 4.0) {
            this.knowledgeBadge = true;
        } else {
            this.knowledgeBadge = false;
        }
        if (this.piazzaGod >= 4.0) {
            this.piazzaGodBadge = true;
        } else {
            this.piazzaGodBadge = false;
        }
        if (this.ohDweller >= 4.0) {
            this.ohDwellerBadge = true;
        } else {
            this.ohDwellerBadge = false;
        }

    }
}

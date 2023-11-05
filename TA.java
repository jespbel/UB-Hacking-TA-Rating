import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class TA{
    public String name;

    private double totalRatings;
    private boolean goatBadge;
    public double kindness;
    private boolean kindnessBadge;

    public double punctuality;
    private boolean punctualityBadge;
    public double passion;
    private boolean passionBadge;
    public double comedian;
    private boolean comedianBadge;
    public double knowledge;
    private boolean knowledgeBadge;
    public double piazzaGod;
    private boolean piazzaGodBadge;
    public double ohDweller;
    public boolean ohDwellerBadge;

    public double getTotalRatings(){
        return this.totalRatings;
    }

    public void setName(String name){
        this.name = name;
    }

    public TA (String name, Double kindness, Double punctuality, Double passion, Double comedian, Double knowledge, Double PiazzaGod, Double ohDweller){
        if (kindness > 5){
            kindness = 5.0;
        }
        if (punctuality > 5){
            punctuality = 5.0;
        }
        if (passion > 5){
            passion = 5.0;
        }
        if (comedian > 5){
            comedian = 5.0;
        }
        if (knowledge > 5){
            knowledge = 5.0;
        }
        if (PiazzaGod > 5){
            PiazzaGod = 5.0;
        }
        if (ohDweller > 5){
            ohDweller = 5.0;
        }
        if (kindness < 1){
            kindness = 1.0;
        }
        if (punctuality < 1){
            punctuality = 1.0;
        }
        if (passion < 1){
            passion = 1.0;
        }
        if (comedian < 1){
            comedian = 1.0;
        }
        if (knowledge < 1){
            knowledge = 1.0;
        }
        if (PiazzaGod < 1){
            PiazzaGod = 1.0;
        }
        if (ohDweller < 1){
            ohDweller = 1.0;
        }
        this.name = name;
        this.kindness = kindness;
        this.punctuality = punctuality;
        this.passion = passion;
        this.comedian = comedian;
        this.knowledge = knowledge;
        this.piazzaGod = PiazzaGod;
        this.ohDweller = ohDweller;
        this.totalRatings = 1;
//        computeAverage(kindness, punctuality, passion, comedian, knowledge, PiazzaGod, ohDweller);
    }

//    public void computeAverage(Double kindness, Double punctuality, Double passion, Double comedian, Double knowledge, Double piazzaGod, Double ohDweller){
//        this.totalRatings = this.getTotalRatings();
//        this.kindness = (this.kindness/this.totalRatings) + (kindness/this.totalRatings);
//        this.punctuality = (this.punctuality/this.totalRatings) + (punctuality/this.totalRatings);
//        this.passion = (this.passion/this.totalRatings) + (passion/this.totalRatings);
//        this.comedian = (this.comedian/this.totalRatings) + (comedian/this.totalRatings);
//        this.knowledge = (this.knowledge/this.totalRatings) + (knowledge/this.totalRatings);
//        this.piazzaGod = (this.piazzaGod/this.totalRatings) + (piazzaGod/this.totalRatings);
//        this.ohDweller = (this.ohDweller/this.totalRatings) + (ohDweller/this.totalRatings);
//    }

    public void addRating(Double kindness, Double punctuality, Double passion, Double comedian, Double knowledge, Double piazzaGod, Double ohDweller){
        if (kindness > 5){
            kindness = 5.0;
        }
        if (punctuality > 5){
            punctuality = 5.0;
        }
        if (passion > 5){
            passion = 5.0;
        }
        if (comedian > 5){
            comedian = 5.0;
        }
        if (knowledge > 5){
            knowledge = 5.0;
        }
        if (piazzaGod > 5){
            piazzaGod = 5.0;
        }
        if (ohDweller > 5){
            ohDweller = 5.0;
        }
        if (kindness < 1){
            kindness = 1.0;
        }
        if (punctuality < 1){
            punctuality = 1.0;
        }
        if (passion < 1){
            passion = 1.0;
        }
        if (comedian < 1){
            comedian = 1.0;
        }
        if (knowledge < 1){
            knowledge = 1.0;
        }
        if (piazzaGod < 1){
            piazzaGod = 1.0;
        }
        if (ohDweller < 1){
            ohDweller = 1.0;
        }
        this.totalRatings = this.getTotalRatings() + 1.0;
        this.kindness = (this.kindness/this.totalRatings) + (kindness/this.totalRatings);
        this.punctuality = (this.punctuality/this.totalRatings) + (punctuality/this.totalRatings);
        this.passion = (this.passion/this.totalRatings) + (passion/this.totalRatings);
        this.comedian = (this.comedian/this.totalRatings) + (comedian/this.totalRatings);
        this.knowledge = (this.knowledge/this.totalRatings) + (knowledge/this.totalRatings);
        this.piazzaGod = (this.piazzaGod/this.totalRatings) + (piazzaGod/this.totalRatings);
        this.ohDweller = (this.ohDweller/this.totalRatings) + (ohDweller/this.totalRatings);
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

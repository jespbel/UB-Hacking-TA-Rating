import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Reviewer {
    private String reviewerID;

    private HashMap<String, Array> reviewHistory;


    public Reviewer(String reviewerID, HashMap<String, Array> reviewHistory) {
        this.reviewerID = reviewerID;
        this.reviewHistory = reviewHistory;
    }

    public String getReviewerID() {
        return this.reviewerID;
    }

    public void setReviewerID(String reviewerID) {
        this.reviewerID = reviewerID;
    }

    public HashMap<String, Array> getReviewHistory() {
        return this.reviewHistory;
    }

    public void setReviewHistory(HashMap<String, Array> reviewHistory) {
        this.reviewHistory = reviewHistory;
    }
}

import java.util.ArrayList;
public class Reviewer {
    private String reviewerID;

    private ArrayList<TA> reviewed;

    public Reviewer(String reviewerID, ArrayList<TA> reviewed) {
        this.reviewerID = reviewerID;
        this.reviewed = reviewed;
    }

    public String getReviewerID() {
        return reviewerID;
    }

    public void setReviewerID(String reviewerID) {
        this.reviewerID = reviewerID;
    }

    public ArrayList<TA> getReviewed() {
        return reviewed;
    }

    public void setReviewed(ArrayList<TA> reviewed) {
        this.reviewed = reviewed;
    }
}

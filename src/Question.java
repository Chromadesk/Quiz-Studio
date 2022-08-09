import java.util.ArrayList;

public abstract class Question {
    private String questionTitle;

    /**
     * @param title The title of the question as well as what the user sees.
     */
    public Question(String title) {
        this.questionTitle = title;
    }

    //get the correct answer to the question, no matter how many correct answers there are
    public abstract String getAnswer();
    public abstract void displayQuestion();
    public String getTitle() {
        return this.questionTitle;
    }
}
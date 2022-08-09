import java.util.ArrayList;

public class TrueFalse extends Question {

    final String questionType = "TrueFalse";
    final boolean correctAnswer;
    /**
     *
     * @param title The title of the question as well as what the user is asked.
     * @param answer A boolean of true or false
     */
    public TrueFalse(String title, boolean answer) {
        super(title);
        this.correctAnswer = answer;
    }

    @Override
    public String getAnswer() {
        return "" + correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(this.getTitle());
        System.out.println("True or False");
    }

}
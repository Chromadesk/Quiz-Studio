import java.util.ArrayList;

public class MultipleChoice extends Question {

    final String questionType = "MultipleChoice";
    ArrayList<String> choices = new ArrayList<>();
    final String correctAnswer;

    /**
     *
     * @param title The title of the question as well as what the user is asked.
     * @param choices An ArrayList of all of the possible choices.
     * @param answer The index of the correct answer
     */
    public MultipleChoice(String title, ArrayList<String> choices, int answer) {
        super(title);
        this.correctAnswer = choices.get(answer);
        this.choices = choices;
    }

    @Override
    public String getAnswer() {
        return correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(this.getTitle());
        for (String choice : choices) {
            System.out.println(choice);
        }
    }
}

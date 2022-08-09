import java.util.ArrayList;

public class Checkbox extends Question {

    final String questionType = "Checkbox";
    ArrayList<String> choices = new ArrayList<>();
    private ArrayList<String> correctAnswers;

    /**
     *
     * @param title The title of the question as well as what the user is asked.
     * @param aChoices An ArrayList of all of the possible choices.
     * @param answers An Arraylist of indexes of correct answers.
     */
    public Checkbox(String title, ArrayList<String> aChoices, ArrayList<Integer> answers) {
        super(title);
        this.choices = aChoices;
        for (int i : answers) {
            this.correctAnswers.add(aChoices.get(i));
        }
    }

    @Override
    public String getAnswer() {
        String finalAnswers = null;
        for (String answer : correctAnswers) {
            finalAnswers += answer + "";
        }
        return finalAnswers;
    }

    @Override
    public void displayQuestion() {
        System.out.println(this.getTitle());
        for (String choice : choices) {
            System.out.println(choice);
        }
    }

}

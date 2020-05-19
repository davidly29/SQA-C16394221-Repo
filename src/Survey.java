import java.util.ArrayList;
import java.util.Map;

public class Survey {
    private String surveyName;
    private Map<Integer, String> questions;
    private ArrayList<SurveyResponse> answers;

    public Survey() {
    }

    public Survey(String surveyName, Map<Integer, String> questions, ArrayList<SurveyResponse> answers) {
        this.surveyName = surveyName;
        this.questions = questions;
        this.answers = answers;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public Map<Integer, String> getQuestions() {
        return questions;
    }

    public void setQuestions(Map<Integer, String> questions) {
        this.questions = questions;
    }

    public ArrayList<SurveyResponse> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<SurveyResponse> answers) {
        this.answers = answers;
    }

    public ArrayList<SurveyResponse> addAnswer(SurveyResponse res) {
        if (this.answers == null) {
            ArrayList<SurveyResponse> response = new ArrayList<>();
            response.add(res);

            this.answers = response;
            return this.answers;
        }
        this.answers.add(res);
        return this.answers;
    }

    public Map<Integer, String> addQuestions(String question) {
        this.questions.put(questions.size() + 1, question);
        return questions;
    }

}

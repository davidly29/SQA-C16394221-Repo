import java.util.HashMap;
import java.util.Map;

public class SurveyResponse {
    private Map<Integer, Integer> answers;

    public SurveyResponse() {
    }

    public SurveyResponse(Map<Integer, Integer> answers) {
        this.answers = answers;
    }

    public Map<Integer, Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Integer, Integer> answers) {
        this.answers = answers;
    }
}

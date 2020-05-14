
import java.util.HashMap;
import java.util.Map;

public class Survey_Driver {
    public static Map<String, Survey> allSurveys = new HashMap<>();

    public static Survey surveyCreation(String name, String questionOne, String questionTwo, String questionThree, String questionFour) {
        Survey newSurvey = new Survey();
        // Setting Questions of survey to map
        Map<Integer, String> questions = new HashMap<>();
        questions.put(1, questionOne);
        questions.put( 2, questionTwo);
        questions.put(3, questionThree);
        questions.put(4, questionFour);

        newSurvey.setSurveyName(name);
        newSurvey.setQuestions(questions);
        allSurveys.put(name, newSurvey);
        return newSurvey;
    }

    public static SurveyResponse surveyResponseCreation(int responseOne, int responseTwo, int responseThree, int responseFour) {
        // Note this method will be called in the context of a specific Survey, so the response will be set to the associated survey upon creation
        return null;
    }



}

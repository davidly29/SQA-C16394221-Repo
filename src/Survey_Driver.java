
import java.util.ArrayList;
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
        SurveyResponse response = new SurveyResponse();
        Map<Integer, Integer> answer = new HashMap<>();
                        int q1Result = responseOne;
                        int q2Result = responseTwo;
                        int q3Result = responseThree;
                        int q4Result = responseFour;
                        answer.put(1, q1Result);
                        answer.put(2, q2Result);
                        answer.put(3, q3Result);
                        answer.put(4, q4Result);
                        response.setAnswers(answer);
        return response;
    }

    public static Survey getSurveyByName(String name) {
        Object[] surveyData = allSurveys.values().toArray();
        for (int i = 0; i < surveyData.length; i++) {
            Survey sur = (Survey) surveyData[i];
            if (sur.getSurveyName().equalsIgnoreCase(name)) {
                return sur;
            }
        }
        return null;
    }

    public static Double getAverageOfSurvey(int surveyQuestion, Survey survey) {
        double sum = 0; // Average will need decimal
        int questionNum = 0;
        for (int j = 0; j < survey.getAnswers().size(); j++) {
            SurveyResponse response  = survey.getAnswers().get(j);
            sum += response.getAnswers().get(surveyQuestion);
            questionNum++;
        }
        sum = sum / questionNum;
        return sum;
    }

    public static Integer getLowestScore(int surveyQuestion, Survey survey) {
        return null;
    }

}

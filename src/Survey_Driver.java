
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
        Survey sur = null;
        Object[] surveyData = allSurveys.values().toArray();
        for (int i = 0; i < surveyData.length; i++) {
            sur = (Survey) surveyData[i];
            if (sur.getSurveyName().equalsIgnoreCase(name)) {
                return sur;
            }
        }
        return sur;
    }

    public static Double getAverageOfSurveyQuestion(int surveyQuestion, Survey survey) {
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

    public static Integer getLowestScoreQuestion(int surveyQuestion, Survey survey) {
        SurveyResponse res  = survey.getAnswers().get(0); // Init to first value
        int lowest = res.getAnswers().get(1);

        for (int j = 0; j < survey.getAnswers().size(); j++) {

            SurveyResponse response  = survey.getAnswers().get(j);
            if (response.getAnswers().get(surveyQuestion) < lowest) {
                lowest = response.getAnswers().get(surveyQuestion);
            }
        }
        return lowest;
    }

    public static Integer getHighestScoreQuestion(int surveyQuestion, Survey survey) {
        SurveyResponse res  = survey.getAnswers().get(0); // Init to first value
        int highest = res.getAnswers().get(1);

        for (int j = 0; j < survey.getAnswers().size(); j++) {
            SurveyResponse response  = survey.getAnswers().get(j);
            if (response.getAnswers().get(surveyQuestion) > highest) {
                highest = response.getAnswers().get(surveyQuestion);
            }
        }
        return highest;
    }

    public static Double getSDForQuestion(int surveyQuestion, Survey survey) {
        double std = 0;
        for (int j = 0; j < survey.getAnswers().size(); j++) {
            SurveyResponse response  = survey.getAnswers().get(j);
            std = std + Math.pow(response.getAnswers().get(surveyQuestion) - Survey_Driver.getAverageOfSurveyQuestion(surveyQuestion, survey), 2);
        }
        return std;
    }

    public static Double getAverageOfSurvey(Survey survey) {
        double sum = 0; // Average will need decimal
        int questionNum = 0;
        for (int j = 0; j < survey.getAnswers().size(); j++) {
            SurveyResponse response  = survey.getAnswers().get(j);
            for(int i = 1; i < response.getAnswers().size(); i++) {
               sum += response.getAnswers().get(i);
               questionNum ++;
            }
        }
        sum = sum / questionNum;
        return sum;
    }

    public static Integer getLowestScoreSurvey(Survey survey) {
        int lowest = survey.getAnswers().get(0).getAnswers().get(1);
        for (int j = 0; j < survey.getAnswers().size(); j++) {
            SurveyResponse response  = survey.getAnswers().get(j);
            for(int i = 1; i < response.getAnswers().size(); i++) {
                if (response.getAnswers().get(i) < lowest) {
                    lowest = response.getAnswers().get(i);
                }
            }
        }
        return lowest;
    }
}

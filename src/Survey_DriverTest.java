import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Survey_DriverTest {
    @Test
    public void shouldCreateSurvey() {
        Survey create = Survey_Driver.surveyCreation("dog survey", "i like dogs", "you like dogs", "you dont like dogs", "they might like dogs");
        assertEquals(create.getSurveyName(), "dog survey");
        assertEquals(create.getQuestions().get(1), "i like dogs");
        assertEquals(create.getQuestions().get(2), "you like dogs");
        assertEquals(create.getQuestions().get(3), "you dont like dogs");
        assertEquals(create.getQuestions().get(4), "they might like dogs");
    }

    @Test
    public void shouldCreateSurveyResponse() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(1, 3 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey

        ArrayList<SurveyResponse> testResponse = create.getAnswers();

        assertEquals(testResponse.get(0).getAnswers().get(1), 1);
        assertEquals(testResponse.get(0).getAnswers().get(2), 3);
        assertEquals(testResponse.get(0).getAnswers().get(3), 2);
        assertEquals(testResponse.get(0).getAnswers().get(4), 5);
    }

    @Test
    public void shouldGetSurveyByName() {
        ArrayList<Survey> allSurveys = new ArrayList<>();
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(1, 3 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        allSurveys.add(create); //Adding Survey to Array

        Survey retrieved = Survey_Driver.getSurveyByName("Cat survey");
        // Testing Questions Retrieved
        assertEquals(retrieved.getSurveyName(), "Cat survey");
        assertEquals(create.getQuestions().get(1), "i like cats");
        assertEquals(create.getQuestions().get(2), "you like cats");
        assertEquals(create.getQuestions().get(3), "you dont like cats");
        assertEquals(create.getQuestions().get(4), "they might like cats");
        // Testing Answer Retrieved
        ArrayList<SurveyResponse> ansResponse = retrieved.getAnswers();

        assertEquals(ansResponse.get(0).getAnswers().get(1), 1);
        assertEquals(ansResponse.get(0).getAnswers().get(2), 3);
        assertEquals(ansResponse.get(0).getAnswers().get(3), 2);
        assertEquals(ansResponse.get(0).getAnswers().get(4), 5);
    }

    // Question Calculations

    @Test
    public void shouldCalculateAverage() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(4, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        double avg = Survey_Driver.getAverageOfSurveyQuestion(1, create);
        assertEquals(4.0, avg);
    }

    @Test
    public void shouldGetMinAnswerQuestion() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        int lowestNumber = Survey_Driver.getLowestScoreQuestion(1, create);
        assertEquals(2, lowestNumber);
    }

    @Test
    public void shouldGetMaxAnswerQuestion() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        int highestScore = Survey_Driver.getHighestScoreQuestion(1, create);
        assertEquals(4, highestScore);
    }
    @Test
    public void shouldGetStDevQuestion() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        double std = Survey_Driver.getSDForQuestion(1, create);
        assertEquals(2, std);

    }

    // Survey Calculations

    @Test
    public void shouldGetAverageSurvey() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        double avg = Survey_Driver.getAverageOfSurvey(create);
        assertEquals(2.8333333333333335, avg);
    }

    @Test
    public void shouldGetLowestSurvey() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 3, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        int lowest = Survey_Driver.getLowestScoreSurvey(create);
        assertEquals(2, lowest);
    }

    @Test
    public void shouldGetHighestSurvey() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 3, 4);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 4);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        int highest = Survey_Driver.getHighestScoreSurvey(create);
        assertEquals(4, highest);
    }

    @Test
    public void shouldGetStdDevSurvey() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 3, 4);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 4);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        double stdDev = Survey_Driver.getStdDevSurvey(create);
        assertEquals(1.0, stdDev);
    }

    @Test
    public void shouldAddNewQuestion() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 3, 4);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 4);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        create = Survey_Driver.addQuestionToSurvey("new cat question", create);
        assertEquals("new cat question", create.getQuestions().get(5));
        assertEquals(5, create.getQuestions().size());

    }

}
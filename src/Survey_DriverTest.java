import org.junit.Test;

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

    @Test
    public void shouldCalculateAverage() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(4, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        double avg = Survey_Driver.getAverageOfSurvey(1, create);
        assertEquals(4.0, avg);
    }

    @Test
    public void shouldGetMinAnswer() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        int lowestNumber = Survey_Driver.getLowestScore(1, create);
        assertEquals(2, lowestNumber);
    }

    @Test
    public void shouldGetMaxAnswer() {
        Survey create = Survey_Driver.surveyCreation("Cat survey", "i like cats", "you like cats", "you dont like cats", "they might like cats");
        SurveyResponse response = Survey_Driver.surveyResponseCreation(4, 3 , 2, 5);
        SurveyResponse response2 = Survey_Driver.surveyResponseCreation(2, 4 , 2, 5);
        create.addAnswer(response); // Adding Survey Response to Survey
        create.addAnswer(response2);

        int highestScore = Survey_Driver.getHighestScore(1, create);
        assertEquals(4, highestScore);
    }
}
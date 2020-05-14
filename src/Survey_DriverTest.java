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



    }

}
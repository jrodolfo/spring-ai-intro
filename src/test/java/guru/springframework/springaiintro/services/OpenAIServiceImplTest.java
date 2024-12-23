package guru.springframework.springaiintro.services;

import guru.springframework.springaiintro.model.Answer;
import guru.springframework.springaiintro.model.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootTest
class OpenAIServiceImplTest {

    private static final Logger logger = Logger.getLogger(OpenAIServiceImplTest.class.getName());

    @Autowired
    OpenAIServiceImpl openAIService;

    final String prompt = "Tell me a dad joke.";

    @Test
    void getAnswerStr() {
        String answer = openAIService.getAnswer(prompt);
        assertNotNull(answer);
        logger.log(Level.INFO, "Answer from OpenAI: " + answer);
    }

    @Test
    void getAnswerObj() {
        Answer answer = openAIService.getAnswer(new Question(prompt));
        assertNotNull(answer);
        logger.log(Level.INFO, "Answer from OpenAI: " + answer);
    }
}
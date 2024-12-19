package guru.springframework.springaiintro.services;

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

    @Test
    void getAnswer() {
        String answer = openAIService.getAnswer("What is the meaning of life?");
        assertNotNull(answer);
        logger.log(Level.INFO, "Answer from OpenAI: " + answer);
    }
}
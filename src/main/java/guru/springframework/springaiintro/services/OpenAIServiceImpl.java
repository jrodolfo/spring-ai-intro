package guru.springframework.springaiintro.services;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class OpenAIServiceImpl implements OpenAIService {

    private static final Logger logger = Logger.getLogger(OpenAIServiceImpl.class.getName());
    private final ChatModel chatModel;

    public OpenAIServiceImpl(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Override
    public String getAnswer(String question) {
        PromptTemplate promptTemplate = new PromptTemplate(question);
        Prompt prompt = promptTemplate.create();
        ChatResponse response = chatModel.call(prompt);
        String responseStr = response.getResult().getOutput().getContent();
        logger.log(Level.INFO, "Answer from OpenAI: " + responseStr);
        return responseStr;
    }
}

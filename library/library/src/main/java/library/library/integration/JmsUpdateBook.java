package library.library.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import library.library.DTO.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class JmsUpdateBook {
    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(BookDTO bookDTO) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String message = objectMapper.writeValueAsString(bookDTO);
        jmsTemplate.convertAndSend(message);
    }
}

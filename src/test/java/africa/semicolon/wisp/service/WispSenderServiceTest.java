package africa.semicolon.wisp.service;

import africa.semicolon.wisp.dtos.requests.SenderRegistrationRequest;
import africa.semicolon.wisp.dtos.response.SenderRegistrationResponse;
import africa.semicolon.wisp.exceptions.SenderRegistrationFailedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class WispSenderServiceTest {
    @Autowired
    private SenderService senderService;
    private SenderRegistrationRequest senderRegistrationRequest;
    private SenderRegistrationResponse senderRegistrationResponse;

    @BeforeEach void setUp() throws SenderRegistrationFailedException {
        senderRegistrationRequest = new SenderRegistrationRequest();
        senderRegistrationRequest.setFirstname("james");
        senderRegistrationRequest.setLastname("king");
        senderRegistrationRequest.setUsername("jamesKing77");
        senderRegistrationRequest.setPassword("1234");
        senderRegistrationResponse = senderService.register(senderRegistrationRequest);
    }

    @Test void senderRegistrationTest(){
        System.out.println("i tried");
        assertThat(senderRegistrationResponse).isNotNull();
    }

}
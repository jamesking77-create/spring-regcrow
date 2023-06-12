package africa.semicolon.wisp.service;

import africa.semicolon.wisp.dtos.requests.SenderRegistrationRequest;
import africa.semicolon.wisp.dtos.response.SenderRegistrationResponse;
import africa.semicolon.wisp.exceptions.SenderRegistrationFailedException;

public interface SenderService {
    SenderRegistrationResponse register(SenderRegistrationRequest senderRegistrationRequest) throws SenderRegistrationFailedException;
}

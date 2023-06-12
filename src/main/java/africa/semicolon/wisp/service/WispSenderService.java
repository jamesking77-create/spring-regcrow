package africa.semicolon.wisp.service;

import africa.semicolon.wisp.data.models.BioData;
import africa.semicolon.wisp.data.models.Sender;
import africa.semicolon.wisp.data.repositories.SenderRepository;
import africa.semicolon.wisp.dtos.requests.SenderRegistrationRequest;
import africa.semicolon.wisp.dtos.response.SenderRegistrationResponse;
import africa.semicolon.wisp.exceptions.SenderRegistrationFailedException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import static africa.semicolon.wisp.utils.ExceptionUtils.USER_REGISTRATION_FAILED;
import static africa.semicolon.wisp.utils.ResponseUtil.USER_REGISTRATION_SUCCESSFUL;

@Service
@AllArgsConstructor
@Slf4j
public class WispSenderService implements SenderService{
    private final SenderRepository senderRepository;
    private  ModelMapper modelMapper;
    @Override
    public SenderRegistrationResponse register(SenderRegistrationRequest senderRegistrationRequest) throws SenderRegistrationFailedException {
        BioData bioData = modelMapper.map(senderRegistrationRequest, BioData.class);
        Sender sender = new Sender();
        sender.setBioData(bioData);
        Sender savedSender = senderRepository.save(sender);
        boolean isSavedSender = savedSender.getId() != null;
        if (!isSavedSender) throw new SenderRegistrationFailedException(String.format(USER_REGISTRATION_FAILED, senderRegistrationRequest.getEmail()));
        return buildRegisteredSenderResponse(savedSender.getId());
    }

    private SenderRegistrationResponse buildRegisteredSenderResponse(Long id) {
        SenderRegistrationResponse senderRegistrationResponse = new SenderRegistrationResponse();
        senderRegistrationResponse.setMessage(USER_REGISTRATION_SUCCESSFUL);
        senderRegistrationResponse.setId(id);
        return senderRegistrationResponse;
    }
}

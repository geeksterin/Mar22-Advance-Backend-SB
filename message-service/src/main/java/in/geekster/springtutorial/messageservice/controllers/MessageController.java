package in.geekster.springtutorial.messageservice.controllers;

import in.geekster.springtutorial.messageservice.dtos.APIResponse;
import in.geekster.springtutorial.messageservice.dtos.MessageDTO;
import in.geekster.springtutorial.messageservice.dtos.MessageSearchRequest;
import in.geekster.springtutorial.messageservice.dtos.UpdateMessageDTO;
import in.geekster.springtutorial.messageservice.enums.LanguageCode;
import in.geekster.springtutorial.messageservice.enums.MessageType;
import in.geekster.springtutorial.messageservice.enums.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("messages")
@Slf4j
public class MessageController {

    @GetMapping
    public List<MessageDTO> getAllMessages() {
        return Collections.emptyList();
    }

    @PostMapping
    public APIResponse createMessage(@Validated @RequestBody final MessageDTO messageDTO) {
        log.info("Received Creation Request: {}", messageDTO);
        final APIResponse response = new APIResponse();
        response.setMessage("Successfully created Message");
        response.setStatus(Status.SUCCESS);
        return response;
    }

    @GetMapping("{id}")
    public MessageDTO getMessageByID(@PathVariable("id") final Long id) {
        log.info("Getting Message by ID: {}", id);
        return new MessageDTO();
    }

//    @PutMapping("{id}")
//    public MessageDTO performCompleteUpdate(@PathVariable("id") final Long id, @RequestBody final MessageDTO messageDTO) {
//        log.info("Updating Message by ID: {} to {}", id, messageDTO);
//        return messageDTO;
//    }

    @PatchMapping("{id}")
    public MessageDTO performPartialUpdate(@PathVariable("id") final Long id, @RequestBody final UpdateMessageDTO updateMessageDTO) {
        log.info("Updating Message by ID:{} to {}", id, updateMessageDTO);
        return new MessageDTO();
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable("{id}") final Long id) {
        log.info("Deleting message by ID: {}", id);
        return "Success";
    }

    @GetMapping(params = {"type"})
    public List<MessageDTO> getAllMessagesByType(@RequestParam("type") final MessageType messageType) {
        log.info("Getting all Messages by Type: {}", messageType);
        return Collections.emptyList();
    }

    @GetMapping(params = {"lang-code"})
    public List<MessageDTO> getAllMessagesByLangCode(@RequestParam("lang-code") final LanguageCode languageCode) {
        log.info("Getting all Messages by Language Code: {}", languageCode);
        return Collections.emptyList();
    }

    @GetMapping(params = {"lang-code", "type"})
    public List<MessageDTO> getAllMessagesByLangCode(
            @RequestParam("lang-code") final LanguageCode languageCode,
            @RequestParam("type") final MessageType messageType) {
        log.info("Getting all Messages by Type: {} and Language Code: {}", messageType, languageCode);
        return Collections.emptyList();
    }

    @PostMapping("search")
    public List<MessageDTO> getAllMessagesBySearchRequest(@RequestBody final MessageSearchRequest searchRequest) {
        log.info("Received Search Request: {}", searchRequest);
        return Collections.emptyList();
    }
}

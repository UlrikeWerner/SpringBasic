package de.github.ulrikewerner.springbasic;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MessageController {
    public List<Message> messageList = new ArrayList<>();

    @PostMapping("/messages")
    public String addMessage(@RequestBody Message body) {
        messageList.add(body);
        return "Ist gespeichert!";
    }

    @GetMapping("/messages")
    public String getMessageList(){
        return "MessagesList:" + messageList.toString();
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessageWithId(@PathVariable UUID id){
        messageList.removeIf((element) -> element.getId().equals(id));
        return "Ist gelöscht!";
    }
}

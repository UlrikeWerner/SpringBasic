package de.github.ulrikewerner.springbasic;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {
    public List<Message> messageList = new ArrayList<>();

    @PostMapping("/messages")
    public String addMessage(@RequestBody String body) {
        messageList.add(new Message(body));
        return "Ist gespeichert!";
    }

    @GetMapping("/messages")
    public String getMessageList(){
        return "MessagesList:" + messageList.toString();
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessageWithId(@PathVariable String id){
        messageList.removeIf((element) -> element.id.equals(id));
        return "Ist gelöscht!";
    }
}

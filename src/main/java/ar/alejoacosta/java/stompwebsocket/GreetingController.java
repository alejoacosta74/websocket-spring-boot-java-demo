package ar.alejoacosta.java.stompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMessage greeting (HelloStompMessage message) throws Exception{
        System.out.println("-> [GreetingController] received message: " + message.getName());
        Thread.sleep(1000); //simulates server answering delay
        System.out.println("-> [GreetingController] sending back: Hello " + message.getName());
        return new GreetingMessage("Hello " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}

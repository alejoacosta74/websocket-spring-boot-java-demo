package ar.alejoacosta.java.stompwebsocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * Configure message broker options.
     *
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // enable a simple memory-based message broker to carry the greeting messages
        // back to the client on destinations prefixed with /topic
        registry.enableSimpleBroker("/topic");
        // designates the /app prefix for messages that are bound for methods annotated with @MessageMapping.
        // This prefix will be used to define all the message mappings.
        // For example, /app/hello is the endpoint that the GreetingController.greeting() method is mapped to handle
        registry.setApplicationDestinationPrefixes("/app");
    }

    /**
     * Register STOMP endpoints mapping each to a specific URL and (optionally)
     * enabling and configuring SockJS fallback options.
     *
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // registers the /gs-guide-websocket endpoint, enabling SockJS fallback options so that
        // alternate transports can be used if WebSocket is not available.
        // The SockJS client will attempt to connect to /gs-guide-websocket and use
        // the best available transport (websocket, xhr-streaming, xhr-polling, and so on).
        registry.addEndpoint("/gs-guide-websocket").withSockJS();

    }
}

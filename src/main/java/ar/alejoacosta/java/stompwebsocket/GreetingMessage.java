package ar.alejoacosta.java.stompwebsocket;

public class GreetingMessage {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GreetingMessage(String content) {
        this.content = content;
    }
}

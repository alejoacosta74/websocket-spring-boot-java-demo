package ar.alejoacosta.java.stompwebsocket;

public class HelloStompMessage {
    private String name;

    public HelloStompMessage (){

    }

    public HelloStompMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

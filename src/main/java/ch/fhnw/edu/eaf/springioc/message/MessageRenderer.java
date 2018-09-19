package ch.fhnw.edu.eaf.springioc.message;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
}

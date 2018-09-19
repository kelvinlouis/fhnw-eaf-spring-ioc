package ch.fhnw.edu.eaf.springioc.message;

public class ExternalizedConstructorHelloWorldMessageProvider implements MessageProvider {
    private final String message;

    public ExternalizedConstructorHelloWorldMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

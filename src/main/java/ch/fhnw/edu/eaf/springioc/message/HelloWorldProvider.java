package ch.fhnw.edu.eaf.springioc.message;

public class HelloWorldProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}

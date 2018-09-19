package ch.fhnw.edu.eaf.springioc.message;

public class WillkommenProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Herzlich Willkommen";
    }
}

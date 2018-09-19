package ch.fhnw.edu.eaf.springioc.message;

public class StandardOutRenderer implements MessageRenderer {
    private MessageProvider messageProvider;


    @Override
    public void render() {
        if (messageProvider == null) throw new IllegalStateException("No Message Provider available");
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;
    }
}

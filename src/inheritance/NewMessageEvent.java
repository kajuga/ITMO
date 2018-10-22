package inheritance;

public class NewMessageEvent implements Event {
    private String text;

    public NewMessageEvent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "NewMessageEvent{" +
                "text='" + text + '\'' +
                '}';
    }
}
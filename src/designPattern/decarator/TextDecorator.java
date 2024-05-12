package designPattern.decarator;

public abstract class TextDecorator implements Text {
    private Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    public String getContent() {
        return text.getContent();
    }
}

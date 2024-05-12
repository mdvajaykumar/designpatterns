package designPattern.decarator;

public class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

//    @Override
//    public String toString() {
//        return "BoldText{}";
//    }

    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}


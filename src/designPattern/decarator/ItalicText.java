package designPattern.decarator;


public class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

//    @Override
//    public String toString() {
//        return "ItalicText{" +
//                "text='" +this + '\'' +
//                '}';
//
//    }

    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }

}

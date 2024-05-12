package designPattern.decarator;

public class client {
    public static void main(String[] args) {
          Text text = new PlainText("Hello World");

          text = new BoldText(text);
          text = new ItalicText(text);

          System.out.println(text.getContent());
    }
}

package ClassWork.Task2;

public class Text {
   String text;

   public Text() {
   }

   public Text(String text) {
      this.text = text;
   }

   @Override
   public String toString() {
      return "Text{" +
              "text='" + text + '\'' +
              '}';
   }

   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
   }
}

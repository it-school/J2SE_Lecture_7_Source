package ClassWork.Task2;

public class Title {
   String title;

   public Title() {
   }

   public Title(String title) {
      this.title = title;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   @Override
   public String toString() {
      return "Title{" +
              "title='" + title + '\'' +
              '}';
   }
}

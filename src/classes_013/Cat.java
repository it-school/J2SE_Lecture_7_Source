package classes_013;

class Cat {
   // Поле - имя
   private String name;
   // Поле - цвет
   private String color;
   private float temperature;

   public Cat() {
      this.setName("");
      this.setColor("black");
      this.setTemperature(37f);
   }

   public Cat(String name, String color, float temperature) {
      this.setName(name);
      this.setColor(color);
      this.setTemperature(temperature);
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name.strip();
   }

   public String getColor() {
      return this.color.toUpperCase();
   }

   public void setColor(String color) {
      this.color = color.strip();
   }

   public float getTemperature() {
      return ((int) temperature * 10) / 10;
   }

   public void setTemperature(float temperature) {
      this.temperature = temperature > 32 && temperature < 43 ? temperature : 37;
   }

   // Метод возвращающий строку с именем кота
   // и фразой " мяучит..."
   String Speak() {
      return name + " мяучит...";
   }

   @Override
   public String toString() {
      return "Cat{" +
              name +
              ", color: '" + color + '\'' +
              ", temperature: " + temperature +
              '}';
   }
}







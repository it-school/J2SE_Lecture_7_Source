// Конструкторы.

package classes_007;

class Classses_007 {
    public static void main(String[] args) {
        Point point = new Point("A", 2, 3);

        System.out.println("Точка " + point.getName() + "(" +
                point.getX() + "," + point.getY() + ")");
    }
}

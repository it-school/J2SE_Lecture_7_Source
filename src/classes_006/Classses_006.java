// Конструкторы.

package classes_006;

class Classses_006 {
    public static void main(String[] args) {
        // Применяем конструктор по умолчанию.
//        Point pointA = new Point();
//        System.out.println("pointA.X = " + pointA.getX() +
//                " " + "pointA.Y = " +  pointA.getY());

        System.out.println("---------------------------------------");

        // Применяем конструктор с параметрами.
        Point pointB = new Point(100, 200);
        System.out.println("pointB.X = " + pointB.getX() +
                " " + "pointB.Y = " + pointB.getY());
    }
}

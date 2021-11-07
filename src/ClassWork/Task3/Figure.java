package ClassWork.Task3;

import java.util.Arrays;

public class Figure {
   public static final int BASE_POINTS_NUMBER = 3;
   Point[] points;
   String title;
/*

   public Figure(Point a, Point b, Point c) {
      points = new Point[3];
      points[0] = a;
      points[1] = b;
      points[2] = c;
      title = "Triangle "+a.name+b.name+c.name;
   }

   public Figure(Point a, Point b, Point c, Point d) {
      points = new Point[4];
      points[0] = a;
      points[1] = b;
      points[2] = c;
      points[3] = d;
      title = "Quadrangle "+a.name+b.name+c.name+d.name;
   }
*/

   public Figure(Point p1, Point p2, Point p3, Point... p) {
      points = new Point[BASE_POINTS_NUMBER + p.length];
      points[0] = p1;
      points[1] = p2;
      points[2] = p3;

      System.arraycopy(p, 0, points, BASE_POINTS_NUMBER, p.length + BASE_POINTS_NUMBER - 3);
/*
      for (int j = BASE_POINTS_NUMBER; j < p.length + BASE_POINTS_NUMBER; j++) {
         points[j] = p[j - 3];
      }
*/

      switch (BASE_POINTS_NUMBER + p.length) {
         case 3 -> title = "Triangle";
         case 4 -> title = "Quadrangle";
         case 5 -> title = "Pentagon";
         default -> title = p.length + "- angle";
      }
/*
      switch (BASE_POINTS_NUMBER + p.length) {
         case 3:
            title = "Triangle";
            break;
         case 4:
            title = "Quadrangle";
            break;
         case 5:
            title = "Pentagon";
            break;
         default:
            title = p.length + "- angle";
            break;
      }
*/

   }

   public double getSideLength(Point p1, Point p2) {
      return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
   }

   public double getPerimeter() {
      double perimeter = 0;
      for (int i = 0; i < points.length; i++) {
         perimeter += getSideLength(points[i], points[(i + 1) % points.length]);
      }
      return perimeter;
   }

   @Override
   public String toString() {
      return title + "\t" + Arrays.toString(points) + ", perimeter is: " + String.format("%5.2f", getPerimeter());
   }
}

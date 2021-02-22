package classes_012;

class Rectangle {
    // Поля
    private double length;
    private double width;
    private double P;
    private double S;

    // Методы
    private void setP() {
        P = 2 * (length + width);
    }

    private void setS() {
        S = length * width;
    }

    // Свойства
    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    double getP() {
        return P;
    }

    double getS() {
        return S;
    }

    // Конструктор
    Rectangle(double _length, double _width) {
        this.length = _length;
        this.width = _width;
        setP();
        setS();
    }
}

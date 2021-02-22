// Передача экземпляра класса в качестве аргумента метода

package classes_008;

class Classses_008 {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        MyClass2 my2 = new MyClass2();

        my2.CallMethod(my);
    }
}

// Классы.
// Использование методов доступа к закрытым полям.

package classes_002;

class MyClass {
    private String field = null;

    void setField(String value) // Метод-мутатор - mutator  (setter)
    {
        field = value;
    }

    String getField()           // Метод-аксессор -  accessor  (getter)
    {
        return field;
    }
}

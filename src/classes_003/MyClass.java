// Классы.
// Использование методов доступа к закрытым полям.

package classes_003;

class MyClass {
    private String field = null;

    void setField(String value) // Метод-мутатор - mutator  (setter)
    {
        if (value.equals("Goodbye"))
            System.out.println("Вы ввели недопустимое значение. Повторите попытку.");
        else
            field = value;
    }

    String getField()           // Метод-аксессор -  accessor  (getter)
    {
        if (field == null)
            return "В поле field отсутствуют данные.";
        else if (field.equals("hello world"))
            return field.toUpperCase() + "!";
        else
            return field + "!";
    }
}

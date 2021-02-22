package classes_003;

class Classes_003 {
    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.setField("Goodbye");
        System.out.println(instance.getField());

        instance.setField("hello world");
        System.out.println(instance.getField());
    }
}
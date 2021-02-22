package classes_010;

class Student {
    // Конструктор класса, определенный пользователем, доступен в любом месте вне класса
    // в пакете classes_010
    Student(String _name, String _speciality) {
        // ключевое слов this явно указывает, что поле относится к данному классу
        this.Name = _name;
        this.Speciality = _speciality;
    }

    // Имя студента, доступен только в класе
    private String Name;
    // Специальность, доступна только в классе
    private String Speciality;

    // Метод для получения Имя, доступен в любом месте вне класса
    // в пакете classes_010
    String getName() {
        return Name;
    }

    // Метод для Изменения Имя, доступен в любом месте вне класса
    // в пакете classes_010
    void setName(String var) {
        this.Name = var;
    }

    // Метод для получения Специальности, доступен в любом месте вне класса
    // в пакете classes_010
    String getSpeciality() {
        return Speciality;
    }

    // Метод сна, а что ещё надо студенту ? :)
    String Sleep() {
        return Name + " засыпает...";
    }
}

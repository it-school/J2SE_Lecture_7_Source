package classes_010;

class Сlasses_010 {
    public static void main(String[] args) {
        Student University[] = new Student[5];

        String speciaity = "Программная инженерия";

        University[0] = new Student("Алексей", speciaity);
        University[1] = new Student("Ваня", speciaity);
        University[2] = new Student("Александр", speciaity);
        University[3] = new Student("Наталия", speciaity);
        University[4] = new Student("Виктор", speciaity);

        for (Student student: University) {
            System.out.println(student.getName() + " учится на специальности : " +
                    student.getSpeciality());
        }

        System.out.println(University[2].Sleep());
    }
}

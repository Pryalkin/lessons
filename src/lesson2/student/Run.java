package lesson2.student;

public class Run {
    public static void main(String[] args) {
        Student student = new Student("Pavel", "Pryalkin", "pms983871", 7.6);
        Aspirant aspirant = new Aspirant("Ivan", "Ivanov", "pms892123", 4.7, "work1");
        Student pavel = new Aspirant("Petr", "Petrov", "ba782987", 9.1, "work2");
        Student[] students = new Student[]{student, aspirant, pavel};
        for (Student st: students) {
            System.out.println(st.getScholarship());
        }
    }
}

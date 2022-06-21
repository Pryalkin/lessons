package lesson2.student;

public class Aspirant extends Student{
    private String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return getAverageMark() > 9 ? 200 : getAverageMark() > 5 ? 180 : 0;
    }

}

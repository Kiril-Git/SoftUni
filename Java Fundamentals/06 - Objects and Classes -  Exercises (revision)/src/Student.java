public class Student {

    String name;
    double avGrade;


    public Student(String name, double avGrade) {
        this.name = name;
        this.avGrade = avGrade;
    }



    String getData() {
        return String.format("This is %s with average grade: %.2f", this.name, this.avGrade);

    }
}

class Student{
    int id;
    String name;
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Samay";

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Ramya";

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Danny";

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.id + " " + student.name);
        }
    }
}

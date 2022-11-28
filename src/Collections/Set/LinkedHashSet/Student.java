////package Collections.Set.LinkedHashSet;
//
//import java.util.Objects;
//
//public class Student implements Comparable<Student> {
//    int id ;
//    String name ;
//    int marks ;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id && marks == student.marks && name.equals(student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, marks);
//    }
//
//    public Student(int id, String name, int marks) {
//        this.id = id;
//        this.name = name;
//        this.marks = marks;
//
//    }
//
//    public static void main(String[] args) {
//        Student student1 = new Student(20, "PQR", 80);
//        Student student2 = new Student(5, "XYZ", 70);
//        Student student3 = new Student(10, "pqr", 65);
//        Student student4 = new Student(25, "MNO", 60);
//        Student student5 = new Student(50, "JKL", 90);
//        Student student6 = new Student(15, "ABC", 75);
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return 0;
//    }
//}

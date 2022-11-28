package Collections.Set.TreeSet;

public class Student implements Comparable<Student> {
    int id ;
    String name ;
    int marks ;

    public Student(int i, String pqr, int i1) {
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }



    public static void main(String[] args) {
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        Student student1 = new Student(20, "PQR", 80);
        Student student2 = new Student(5, "XYZ", 70);
        Student student3 = new Student(10, "pqr", 65);
        Student student4 = new Student(25, "MNO", 60);
        Student student5 = new Student(50, "JKL", 90);
        Student student6 = new Student(15, "ABC", 75);
    }


    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}

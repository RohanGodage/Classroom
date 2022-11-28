package ClassAndObject;

public class Student {

        String name ="John";
        int roll_no=2;
        long phone_no;
        String address;
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public Student(String name, int roll_no, long phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    public Student(int i, String name, int i1) {
    }

    public static void main(String[] args) {
        Student student1 = new Student("John",2,9090,"ABC");

        Student student2 = new Student("Sam",3,7070,"PQR");
        System.out.println(student1.name);
        System.out.println(student1.roll_no);
        System.out.println(student1.address);
        System.out.println(student1.phone_no);
        System.out.println(student2.name);
        System.out.println(student2.roll_no);
        System.out.println(student2.address);
        System.out.println(student2.phone_no);
    }

}

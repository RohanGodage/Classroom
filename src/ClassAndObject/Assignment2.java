package ClassAndObject;

public class Assignment2 {

    String name;
    int rollno;
    long phoneno;
    String address;

    public Assignment2(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public Assignment2(String name, int rollno, long phoneno, String address) {
        this.name = name;
        this.rollno = rollno;
        this.phoneno = phoneno;
        this.address = address;
    }

    public static void main(String[] args) {
        Assignment2 assignment21 = new Assignment2("John",2);
        Assignment2 assignment22 = new Assignment2("Sam",1,880101010,"Pune");
        System.out.println(assignment21.rollno);
        System.out.println(assignment21.name);
        System.out.println(assignment22.rollno);
        System.out.println(assignment22.name);
        System.out.println(assignment22.address);
        System.out.println(assignment22.phoneno);

    }
}

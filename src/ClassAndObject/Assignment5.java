package ClassAndObject;

public class Assignment5 {
    int length;
    int breadth;

    public Assignment5(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
    int area(int length,int breadth){
        int area = length*breadth;
        System.out.println("length : "+length);
        System.out.println("breadth : "+breadth);
        return area;
    }



    public static void main(String[] args) {
        Assignment5 assignment5 = new Assignment5(4,5);
        Assignment5 assignment51 = new Assignment5(5,8);
        System.out.println(assignment5.area(4,5));
        System.out.println(assignment51.area(5,8));


    }

}

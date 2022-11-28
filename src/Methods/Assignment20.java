package Methods;

public class Assignment20 {
    void getDegree(){
        System.out.println("I got a degree .");

    }
    public static class UnderGraduate {
        void getDegree() {
            System.out.println("I am a undergraduate");

        }
    }
    public static class PostGraduate {
        void getDegree() {
            System.out.println("I got a postgraduate .");

        }
    }

    public static void main(String[] args) {
        Assignment20 assignment20 = new Assignment20();
        assignment20.getDegree();
        UnderGraduate underGraduate = new UnderGraduate();
        underGraduate.getDegree();
        PostGraduate postGraduate = new PostGraduate();
        postGraduate.getDegree();
    }
}

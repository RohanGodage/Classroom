package Abstract_Class.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Cylinder();
        shapes[3] = new Rectangle();
        //System.out.println("Circle : "+shapes[0]);
        shapes[0].area();
        //System.out.println("Square : "+shapes[1]);
        shapes[1].area();
        //System.out.println("Cylinder : "+shapes[2]);
        shapes[2].area();
        //System.out.println("Rectangle : "+shapes[3]);
        shapes[3].area();



    }
}

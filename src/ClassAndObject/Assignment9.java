package ClassAndObject;

public class Assignment9 {
int  info(String name,int yoj,String address) {
    String space = "\t\t\t";
    System.out.print("NAME"+space);
    System.out.print("YEAR OF JOINING"+space);
    System.out.println("ADDRESS");

    System.out.print(name+space);
    System.out.print(yoj+space);
    System.out.println(address);
    return yoj;

}

    public static void main(String[] args) {
        Assignment9 assignment9 = new Assignment9();
        assignment9.info("Robert\t",1994,"64C-WallStreet");
        assignment9.info("Sam   \t",2000,"68D-WallStreet");
        assignment9.info("John  \t",1999,"26B-WallStreet");

    }
}

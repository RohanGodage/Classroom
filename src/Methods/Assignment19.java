package Methods;

import java.util.Scanner;

public class Assignment19 {
    String name;
    int age;
    String address;

    public Assignment19(int name, int age, String address) {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public Assignment19() {

    }

    public void setName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentage = new int[10];
        Assignment19 assignment19= new Assignment19();
        for (int i = 0; i < studentage.length; i++)
        {
            System.out.println("Enter element  at "+i+" position : ");
            studentage[i] = sc.nextInt();

        }
        for (int i = 0; i < studentage.length; i++)
        {
            System.out.println("Element at index"+i+" is : "+studentage[i]);
        }
    }
}

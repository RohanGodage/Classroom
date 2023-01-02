package MemoryManagment;

public class Memory {

    int c=10;//instance variables
    int d=20;//instance variables

    void m1(/*local variables*/int a, int b){
        int c=10;//local variables
        int d=20;//local variables


    }
    //static method
    static void m2(){

    }
    //no local method






    public static void main(String[] args) {
        Memory memory = new Memory();
        System.out.println(memory.c);//calling instance variables with help of reference variables.
        System.out.println();
    }
}

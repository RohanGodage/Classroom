package Operators;

public class Assignment12 {
    double AGradeGirls (double AgradeTotal,double AGradeBoys){
        double AGradeGirls = (AgradeTotal-AGradeBoys);
        return  AGradeGirls;
    }
    public static void main(String[] args) {
        double total = 90;
        double totalBoys = 45;
        double AGradetotal = 0.5*total;
        double AGradeBoys = 20;
        Assignment12 assignment12 = new Assignment12();
        System.out.println("Total Girls : " + assignment12.AGradeGirls(AGradetotal,AGradeBoys));
    }
}

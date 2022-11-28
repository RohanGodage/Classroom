package Random;

public class electricityBill {
    public static void main(String[] args) {
        //no of devices
        int bulb=5;
        int fan = 2;
        int tv=1;
       //duration
        int bulbHrs=8;
        int fanhrs=8;
        int tvhrs=8;
        //power
        int bulbwatt=50;
        int fanwatt=150;
        int tvwatt=550;
        int units = bulb*bulbHrs*bulbwatt+fan*fanhrs*fanwatt+tv*tvhrs*tvwatt;
        System.out.println("units : "+units);
        int amt;
    /*
    0-100 = 5
    101-500=10
    501>20
     */
        if(units >=0 && units <=100){
            amt = 5*units;

        }
        else if (units >=101 && units <=500)
        {
         amt = 10*units;
        }
        else{
            amt= units*20;
        }
        System.out.println("amount : " +amt);
    }
}

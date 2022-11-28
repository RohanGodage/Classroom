package Operators;

import Operators.Assignment7;

public class Assignment8 extends  Assignment7{
        boolean check(int a, int b )
        {
                boolean check = false;
                if(a<50 || a<b)
                {
                        check = true;
                }
                return  check;
        }

public static void main(String[]args){
        Assignment8 assignment8 = new Assignment8();
        int a =50;
        int b =70;
        System.out.println("Value : "+assignment8.check(a,b));
        }
        }

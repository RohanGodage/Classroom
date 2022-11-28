package Abstract_Class.InstrumentPractice;

import java.util.Scanner;

public abstract class Instrument1 {
    public abstract void play();




    public static void main(String[] args)
    {
        class Piano extends Instrument1
        {
            @Override
            public void play() {
                System.out.println("Piano is playing tan tan tan tan.");
            }
        }
        class Flute extends Instrument1 {
            @Override
            public void play() {
                System.out.println("Flute is playing tut tut tut.");
            }
        }
        class  Guitar extends Instrument1
        {
            @Override
            public void play() {
                System.out.println("Guitar is playing tin tin tin.");
            }
        }
        Instrument1[] instrument = new Instrument1[10];
        instrument[1] = new Piano();
        instrument[2] = new Flute();
        instrument[3] = new Guitar();
        System.out.println("Select one : 1)Piano 2) Flute 3) Guitar");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Output : "+instrument[num]);
        instrument[num].play();
    }
}

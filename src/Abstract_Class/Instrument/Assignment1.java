package Abstract_Class.Instrument;


import Abstract_Class.InstrumentPractice.Instrument1;

import java.util.Scanner;

abstract class Instrument
    {
        abstract void play();

        public static void main(String[] args) {



                class Piano extends Instrument1 {
                    @Override
                    public void play() {
                        System.out.println(" Piano is playing tan tan tan tan");

                    }
                }
                class Flute extends Instrument1 {
                    @Override
                    public void play() {
                        System.out.println("Flute is playing toot toot toot toot");
                    }
                }
                class Guitar extends Instrument1 {
                    @Override
                    public void play() {
                        System.out.println("Guitar is playing tin tin tin ");
                    }
                }

                Instrument1[] instrument = new Instrument1[10];
                instrument[0]=new Piano();
                instrument[1]=new Flute();
                instrument[2]=new Guitar();

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter num : ");
                int num = sc.nextInt();
                System.out.println(instrument[num]);//memory address
                instrument[num].play();//overridden method
            }
        }






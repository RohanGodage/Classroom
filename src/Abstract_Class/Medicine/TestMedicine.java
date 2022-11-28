package Abstract_Class.Medicine;

import java.util.Random;

abstract class TestMedicine extends Medicine {
    public static void main(String[] args) {
        class Tablet extends Medicine{
            @Override
            Object displayLabel() {
                String output ="Store in a cool and dry place.";

                return output;
            }
        }
        class ointments extends Medicine{
            @Override
            Object displayLabel() {
                String output ="for external use only";

                return output;
            }
        }
        class Syrup extends Medicine{
            @Override
            Object displayLabel() {
                String output ="Use twice daily.";

                return output;
            }
        }
        Medicine [] medicine= new Medicine[10];
        medicine[0] = new Tablet();
        medicine[1] = new Syrup();
        medicine[2] = new ointments();

        Random rand= new Random();
        int boundupper = 3;
        int rand_Int = rand.nextInt(boundupper);
        String result = String.valueOf(medicine[rand_Int]);
        switch ( rand_Int)
        {
            case 0:
            {
                System.out.println(medicine[rand_Int].displayLabel());
            }
            case 1:
            {
                System.out.println(medicine[rand_Int].displayLabel());
            }
            case 2:
            {
                System.out.println(medicine[rand_Int].displayLabel());
            }
        }


    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test data: ");
        System.out.print("Dog is Barking. It is 1am.                    ");
        System.out.println(BarkingDog.shouldWakeUp(true,1));
        System.out.print("Dog is not barking. It is 2am.                ");
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.print("Dog is barking. It is 8am.                    ");
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.print("Dog is barking. It is -1 so should is false.  ");
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }

    public class BarkingDog
    {
        public static boolean shouldWakeUp(boolean isBarking, int hourOfDay)
        {
            if (!isBarking) return false;
            else
            {
                if ((hourOfDay > 7 && hourOfDay < 22) || (hourOfDay < 0 || hourOfDay > 23)) return false;
                else return true;
            }
        }
    }
}
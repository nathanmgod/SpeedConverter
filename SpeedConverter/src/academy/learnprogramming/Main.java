package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {



    }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour = 0;
        if(kilometersPerHour > 0){
            milesPerHour = (long)(kilometersPerHour * 0.621371192);
            System.out.println("It's " + milesPerHour + " miles per hour");
        }

        else if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(milesPerHour);
    }


}

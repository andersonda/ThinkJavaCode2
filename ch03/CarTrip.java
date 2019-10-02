// David Anderson
public class CarTrip{

    public static void main(String[] args) {

        System.out.println("Testing static method kilometersToMiles");
        System.out.println(kilometersToMiles(0)); // expect 0.0
        System.out.println(kilometersToMiles(1.609344)); // expect 1.0
        System.out.println(kilometersToMiles(1)); // expect approximately 0.6213712
        System.out.println(); // create empty line

        System.out.println("Testing static method milesPerHour");
        System.out.println(milesPerHour(1, 1)); // we want to go 1 mile in 1 hour, so we expect 1 mph to be the average speed
        System.out.println(milesPerHour(300, 4)); // we want to go 300 miles in 4 hours, so the average speed we would need to go is 300/4 or 75 mph
        System.out.println(milesPerHour(100, 3)); // we want to go 100 miles in 3 hours, so we would need to be going 33 and 1/3 mph, note the fuzzyness of the answer
        System.out.println(milesPerHour(200.5, 2)); // 200.5 miles in 2 hours, 100.25 mph average speed
        System.out.println(milesPerHour(100, 0)); // ERROR! cannot divide by zero. Program will output "Infinity"
        System.out.println();

        System.out.println("Testing static method milesPerHourKM");
        System.out.println(milesPerHourKM(300, 4));
        System.out.println();

        System.out.println("Testing static method hoursToStop");
        // we have 10 gallons in our tank, and get 30 miles per gallon,
        // meaning the entire tank has a capacity of 300 miles.
        // If we are traveling at 60 miles per hour, our tank will last 300 / 60
        // hours, which is 5.
        System.out.println(hoursToStop(10, 30, 60));
    }

    /*
     * Given the speed in kilometers, returns the speed in miles
     */
    public static double kilometersToMiles(double kilometers){
        double metersPerMile = 1609.344;
        int metersPerKilometer = 1000;
        return kilometers * metersPerKilometer / metersPerMile; // if returnType is not void, the last statement returns the result of the method
        // could also do return kilometers * 1000 / 1609.344
    }

    /* Given the number of miles you need to go and the number of hours you want to take to get there,
     * calculate the average speed in miles per hour you need to travel
     */
    public static double milesPerHour(double miles, double hours){
        return miles / hours;
    }

    /*
     * Given the number of KILOMETERS you need to go and the number of hours you want to take to get there,
     * calculate the average speed in miles per hour you need to travel
     */
    public static double milesPerHourKM(double kilometers, double hours){
      // first, convert the kilometers parameter to miles, using the method we defined before
      double miles = kilometersToMiles(kilometers);

      // now, we can use our milesPerHour method to do the work for us!
      // return miles / hours;
      return milesPerHour(miles, hours);
    }

    /*
     * Let’s say we fill the tank with a certain number of gallons of gasoline.
     * We also know that the car will drive a certain number of miles per gallon
     * when we drive it at a certain speed (on the open road, we’ll assume that
     * we are driving that speed the whole time. How long until we need to refill our tank?
     */
    public static double hoursToStop(double gallons, double milesPerGallon, double milesPerHour) {
      return gallons * milesPerGallon / milesPerHour;
    }
}

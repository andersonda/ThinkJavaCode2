public class Variables {

    public static void main(String[] args) {

        String message;
        int hour, minute;
        //  System.out.println(message); // not allowed, we cant use variables before anything is stored in them!

        message = "Hello!";  // give message the value "Hello!"
        hour = 11;           // assign the value 11 to hour
        minute = 59;         // set minute to 59

        message = "123";     // legal
        // message = 123;    // not legal

        int a = 5;
        int b = a;     // a and b are now equal: a = 5, b = 5
        a = 3;         // a and b are no longer equal, a = 3, b = 5!
        System.out.println(a);
        System.out.println(b);

        String firstLine = "Hello, again!";
        System.out.println(firstLine);

        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);

        // We will improve this tomorrow!
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        System.out.println(1 + 2 + "Hello"); // the output is 3Hello

        System.out.println("Hello" + 1 + 2); // the output is Hello12

        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute); // asumes hour is in the 24 hour format

        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);

        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);

        // using the modulo (%) operator to separate total inches to feet and inches
        int totalInches = 76;
        int feet = 76 / 12; // yields 6, remember that integer division rounds down!
        int inches = 76 % 12; // yields 4 because 76 = 6 * 12 + 4. In other words, 4 is the remainder when dividing
        System.out.println("In " + totalInches + " inches there are " + feet + " feet with " + inches + " inches left over.");

        double pi;
        pi = 3.14159;

        double minuteDouble = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minuteDouble / 60.0);

        // double y = 1 / 3; // incorrect
        double y = 1.0 / 3.0;  // correct

        // these next two print lines should produce the same output, but they don't becase of the rounding errors in floating point numbers
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                         + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
    }

}

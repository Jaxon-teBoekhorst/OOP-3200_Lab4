import helpers.io;

import java.io.IOException;
import java.lang.Math;

/**
 * Lab 4 - Jaxon teBoekhorst <br/>
 * This is a program that gets user input and applies <br/>
 * math functions to it then returns it to the user
 *
 * @author Jaxon teBoekhorst
 * @version 1.0 (Nov 16, 2022)
 */
public class Main {
    public static void main(String[] args) {
        final float GRAVITY = 9.80665f;
        final String START_MESSAGE = """
                Gravity Calculator
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Instructions:
                You will be asked to input:
                    - The initial angle of the projectile
                    - The initial velocity of the projectile
                    - The time you wish to know the projectile's position at

                Please only enter valid digits (no letters or special characters)
                                
                Notes:
                    - All values will be assumed as positive
                    - The projectile's starting height is 0
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""";

        io.println(START_MESSAGE);

        // input variable
        double angle = 0.0d;
        double velocity = 0.0d;
        double time = 0.0d;

        try {
            angle = Math.abs(Double.parseDouble(io.input("Please enter the initial angle: ")));
            velocity = Math.abs(Double.parseDouble(io.input("Please enter the initial velocity: ")));
            time = Math.abs(Double.parseDouble(io.input("Please enter the desired time: ")));
        } catch (IOException e) {
            // print error and exit with error value
            io.println(e.getMessage());
            System.exit(-1);
        } catch (NumberFormatException e) {
            // Note: I know this validation wasn't needed for the program, but I needed the try catch for input anyway,
            //      so I put it in as it was easy

            // print error message and exit with error value
            io.println("ERROR: A non-numeric value was entered");
            System.exit(-1);
        }

        double height = 0.0d;
        // equation is : (v sin a)t - 1/2gt^2
        // v - velocity
        // a = angle
        // t - time
        // g - gravity

        height = velocity * Math.sin(angle) * time;
        height += -0.5 * GRAVITY * Math.pow(time, 2);

        // print the formatted output, doubles will be formatted to one decimal place
        io.println(String.format("The height of the projectile at %.1f seconds is %.1f meters", time, height));
    }
}
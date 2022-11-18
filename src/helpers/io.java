package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * helpers.io - Jaxon teBoekhorst <br/>
 * This is a class that contains all my io helper function for throughout my OOP-3200 course
 *
 * @author Jaxon teBoekhorst
 * @version 1.1 (Nov 16, 2022)
 */
public class io {

    // Input functions
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * This method gets user input and returns it as a string
     *
     * @return String
     */
    public static String input() throws IOException {
        // read and return input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    /**
     * This method prints a prompt then gets user input and returns it as a string
     *
     * @param prompt this is the prompt that will be printed to the console
     * @return String
     */
    public static String input(String prompt) throws IOException{
        // output prompt
        System.out.print(prompt);
        // read and return input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    // Print functions
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * This function is intended as a shorthand for printing to the console
     *
     * @param message The Message that will be printed to the console
     */
    public static void print(String message) {
        System.out.print(message);
    }

    /**
     * This function is intended as a shorthand for printing to the console
     *
     * @param message The Message that will be printed to the console
     */
    public static void print(boolean message) {
        System.out.print(String.valueOf(message));
    }

    /**
     * This function is intended as a shorthand for printing to the console
     *
     * @param message The Message that will be printed to the console
     */
    public static void print(int message) {
        System.out.print(String.valueOf(message));
    }

    /**
     * This function is intended as a shorthand for printing to the console
     *
     * @param message The Message that will be printed to the console
     */
    public static void print(float message) {
        System.out.print(String.valueOf(message));
    }

    /**
     * This function is intended as a shorthand for printing to the console
     *
     * @param message The Message that will be printed to the console
     */
    public static void print(double message) {
        System.out.print(String.valueOf(message));
    }

    // Print line functions
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * This function is intended as a shorthand for printing to the console
     * with a line break at the end
     *
     * @param message The Message that will be printed to the console
     */
    public static void println(String message) {
        System.out.println(message);
    }

    /**
     * This function is intended as a shorthand for printing to the console
     * with a line break at the end
     *
     * @param message The Message that will be printed to the console
     */
    public static void println(boolean message) {
        System.out.println(String.valueOf(message));
    }

    /**
     * This function is intended as a shorthand for printing to the console
     * with a line break at the end
     *
     * @param message The Message that will be printed to the console
     */
    public static void println(int message) {
        System.out.println(String.valueOf(message));
    }

    /**
     * This function is intended as a shorthand for printing to the console
     * with a line break at the end
     *
     * @param message The Message that will be printed to the console
     */
    public static void println(float message) {
        System.out.println(String.valueOf(message));
    }

    /**
     * This function is intended as a shorthand for printing to the console
     * with a line break at the end
     *
     * @param message The Message that will be printed to the console
     */
    public static void println(double message) {
        System.out.println(String.valueOf(message));
    }

}

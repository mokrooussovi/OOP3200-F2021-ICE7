/**
 * @author Ivan Mokrooussov
 * @studentID 100808605
 * @version 0.0.1
 * @date November 3, 2021
 */

package ca.durhamcollege;

public class Main
{

    public static float square(float value)
    {
        return value * value;
    }

    /**
     * The entry point for our program
     *
     * @param args of array of command line parameters
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Person person = new Person();
        Person person1 = new Person(person.getName(), person.getAge());
        Person person2 = new Person("Tom", 40);
        person.saysHello();
        person1.saysHello();
        person2.saysHello();
        Person person3 = new Person("Bob");
        person3.saysHello();

        float valueToSquare = 5;
        float squaredValue = square(valueToSquare);

        // example of output
        System.out.println("The Squared Value is: " + squaredValue);

    }
}


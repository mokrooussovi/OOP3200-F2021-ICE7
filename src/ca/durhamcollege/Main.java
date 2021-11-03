/**
 * @author Ivan Mokrooussov
 * @studentID 100808605
 * @date November 3, 2021
 */

package ca.durhamcollege;

public class Main {

    /**
     * The entry point for our program
     * @param args of array of command line parameters
     */
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        Person person = new Person();
        Person person1 = new Person(person.getName(), person.getAge());
        Person person2 = new Person("Tom", 40);
        person.saysHello();
        person2.saysHello();
    }
}

package ca.durhamcollege;


public class Person
{
    // PRIVATE INSTANCE VARIABLES
    private String m_name;
    private int m_age;

    // Constructors
    /**
     * Default Constructor
     */
    public Person()
    {
        this.m_name = "unknown";
        this.m_age = 0;
    }

    /**
     * The parametrized Constructor
     */
    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
        /* Set(name, age); */
    }


    /**
     * Parameterized Constructor with one parameter of name
     * @param
     */
    public Person(String name)
    {
        this.m_name = name;
        this.m_age = 0;
    }

    /**
     * Parameterized Constructor with one parameter of age
     * @param
     */
    public Person(int age)
    {
        this.m_name = "unknown";
        this.m_age = age;
    }

    // PUBLIC PROPERTIES

    public String getName()
    {
        return m_name;
    }

    // Getters and Setters
    public int getAge()
    {
        return m_age;
    }


    public void Set(String name, int age)
    {
        SetName(name);
        SetAge(age);
    }

    private void SetAge(int age)
    {
        m_age = age;
    }

    private void SetName(String name)
    {
        m_name = name;
    }

    // METHODS

    /**
     * This method tests the Person class and returns a simple message to the console
     * @return {Void}
     */
    public void saysHello()
    {
        System.out.println(this.m_name + " says Hello!");
    }

    /**
     * This method overrides the build-in toString() method and returns the Person properties
     * @return {String}
     */
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "Name: " + this.m_name + " ";
        outputString += "Age : " + this.m_age;
        return outputString;
    }
}

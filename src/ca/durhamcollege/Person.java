package ca.durhamcollege;

/**
 * This is the 'Person' class
 */
public class Person
{
    // PRIVATE INSTANCE VARIABLES

    private String m_name;
    private int m_age;

    // PUBLIC PROPERTIES

    /**
     * Getter getName()
     * @return m_name
     */
    public String getName()
    {
        return m_name;
    }

    /**
     * Setter stName()
     * @param m_name
     */
    public void setName(String m_name)
    {
        this.m_name = m_name;
    }

    /**
     * Getter getAge()
     * @return m_age
     */
    public int getAge()
    {
        return m_age;
    }

    /**
     * Setter setAge()
     * @param m_age
     */
    public void setAge(int m_age)
    {
        this.m_age = m_age;
    }


    /**
     * Default Constructor
     */
    public Person()
    {
        this.m_name = "unknown";
        this.m_age = 0;
    }

    /**
     * Parameterized Constructor
     * @param name
     * @param age
     */
    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    /**
     * Parameterized Constructor with one parameter of name
     * @param name
     */
    public Person(String name)
    {
        this.m_name = name;
        this.m_age = 0;
    }

    /**
     * Parameterized Constructor with one parameter of age
     * @param age
     */
    public Person(int age)
    {
        this.m_name = "unknown";
        this.m_age = age;
    }

    // METHODS

    /**
     * This method tests the Person class and retnrns a simple message to the console
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

package com.williamhopper;

/**
 * The Interpreter type.
 */
public class Interpreter
{
    /**
     * The Artist First Name.
     */
    private String name;
    /**
     * The Artist Surname.
     */
    private String surname;
    /**
     * The Artist Age.
     */
    private int age;

    /**
     * Instantiates a new Interpreter.
     *
     * @param pName    the first name
     * @param pSurname the last surname
     * @param pAge     the age
     */
    public Interpreter(String pName, String pSurname, int pAge)
    {
        this.name = pName;
        this.surname = pSurname;
        this.age = pAge;
    }

    /**
     * Gets first name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets surname.
     *
     * @return the surname
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge()
    {
        return age;
    }
}

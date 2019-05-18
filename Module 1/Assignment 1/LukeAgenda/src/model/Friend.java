package model;

/**
 * Class that models a Friend
 *
 * @author Pedro Guillermo Feij�o-Garc�a
 */
public class Friend
{
    /**
     * Friend's name
     */
    private String name;

    /**
     * Friend's address
     */
    private String address;

    /**
     * Friend's phone number
     */
    private int phoneNumber;

    /**
     * Constructor method that creates an instance of a Friend
     *
     * @param name        input name of the new Friend
     * @param address     input address of the new Friend
     * @param phoneNumber input phone number of the new Friend
     */
    public Friend(String name, String address, int phoneNumber)
    {
        this.name = name; this.address = address; this.phoneNumber = phoneNumber;
    }


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     *
     * @param phoneNumber the phone number
     */
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}

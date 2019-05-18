package model;

/**
 * Class that models an Agenda
 *
 * @author Pedro Guillermo Feijóo-García
 */
public class Agenda
{
    /**
     * Number of Friends
     */
    private int numberOfFriends;

    /*
     * These are the relationships with the Friend class
     */

    private Friend friend1;        // First friend of the Agenda
    private Friend friend2;    // Second friend of the Agenda
    private Friend friend3;        // Third friend of the Agenda

    /**
     * Constructor method that creates an instance of an Agenda
     */
    public Agenda()
    {
        numberOfFriends = 0; friend1 = null; friend2 = null; friend3 = null;
    }

    /*
     * These methods are called "Getters"
     * They are in charge of retrieving particular values of the object
     */

    /**
     * Method that returns the number of friends in the Agenda
     *
     * @return the number of friends
     */
    public int getNumberOfFriends()
    {
        return numberOfFriends;
    }

    /**
     * Method that returns the first Friend of the Agenda
     *
     * @return the first Friend
     */
    public Friend getFriend1()
    {
        return friend1;
    }

    /**
     * Method that returns the second Friend of the Agenda
     *
     * @return the second Friend
     */
    public Friend getFriend2()
    {
        return friend2;
    }

    /**
     * Method that returns the third Friend of the Agenda
     *
     * @return the third Friend
     */
    public Friend getFriend3()
    {
        return friend3;
    }

    /*
     * These methods correspond to the Functional Requirements
     * They directly address the actions/operations/services the user wants to be able to do with the Software
     */

    /**
     * Method that adds a new Friend to the Agenda
     *
     * @param pFriend Friend to be added to the Agenda
     * @return true if the Friend is added to the Agenda. False otherwise.
     */
    public boolean addNewFriend(Friend pFriend)
    {
        boolean added = false;

        /*
         * COMPLETE
         * [1] Check if there is any existing Friend with the same name of pFriend.
         *     Hint: Call and use the method searchFriendByName(...);
         * [2] If there is no existing Friend with the same name as pFriend, add pFriend to the first empty slot.
         *     Hint: From friend1 to friend3, check each relation to find which one of those is the first null relation. When found, make that relation equal to pFriend.
         * [3] Remember to increase the numberOfFriends when adding a new Friend to the Agenda.
         */

        if (searchFriendByName(pFriend.getName()) == null)
        {
            if (friend1 == null)
            {
                friend1 = pFriend; added = true; numberOfFriends++;
            } else if (friend2 == null)
            {
                friend2 = pFriend; added = true; numberOfFriends++;
            } else if (friend3 == null)
            {
                friend3 = pFriend; added = true; numberOfFriends++;
            }
        }


        return added;
    }

    /**
     * Method that searches for a Friend by an input name
     *
     * @param pName name of the Friend looked for
     * @return the Friend corresponding to the input name. Null if he/she does not exist.
     */
    public Friend searchFriendByName(String pName)
    {
        Friend myFriend = null;

        if (friend1 != null && friend1.getName().equals(pName))
        {
            myFriend = friend1;
        }

        if (friend2 != null && friend2.getName().equals(pName))
        {
            myFriend = friend2;
        }

        if (friend3 != null && friend3.getName().equals(pName))
        {
            myFriend = friend3;
        }

        return myFriend;
    }

    /**
     * Method that returns a String with the list of friends' names and phone numbers.
     *
     * @return a String with the list of friends' names and phone numbers.
     */
    public String getListOfFriends()
    {
        String listOfFriends = "";

        if (friend1 != null)
        {
            //README When you successfully complete the class Friend, uncomment the next line of code
            listOfFriends = listOfFriends + friend1.getName() + ": " + friend1.getPhoneNumber() + "\n";
        }

        if (friend2 != null)
        {
            //README When you successfully complete the class Friend, uncomment the next line of code
            listOfFriends = listOfFriends + friend2.getName() + ": " + friend2.getPhoneNumber() + "\n";
        }

        if (friend3 != null)
        {
            //README When you successfully complete the class Friend, uncomment the next line of code
            listOfFriends = listOfFriends + friend3.getName() + ": " + friend3.getPhoneNumber() + "\n";
        }

        return listOfFriends;
    }


}

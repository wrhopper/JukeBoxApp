package com.williamhopper;

/**
 * The type Song.
 * @author Will R Hopper
 * @version 1.0
 */
public class Song
{
    /**
     * Song Name
     */
    private String name;

    /**
     * Song Duration Stored in Seconds
     */
    private int duration; //TODO: Implement conversion in Main Interface

    /**
     * Instantiates a new Song.
     *
     * @param pName     the song name
     * @param pDuration the duration
     */
    public Song(String pName, int pDuration)
    {
        this.name = pName;
        this.duration = pDuration;
    }

    /**
     * Gets name.
     *
     * @return the name of the song
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets duration.
     *
     * @return the duration of the song in seconds
     * 3:00 -> duration = 600;
     */
    public int getDuration()
    {
        return duration;
    }
}

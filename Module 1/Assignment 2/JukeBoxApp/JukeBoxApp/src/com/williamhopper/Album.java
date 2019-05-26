package com.williamhopper;

import java.util.*;

/**
 * The type Album.
 * @author William Hopper
 * @version 1.0
 */
public class Album
{
    /**
     * Album Name
     */
    private String name;

    /**
     * The Genre
     * Would probably build Genre class for pregenerated genres
     */
    private String genre;
    /**
     * The Album Price.
     * Stored in cents
     * USD $$12.34 * 100 = 1234
     */
    private double price;

    /**
     * The Number of songs on the album
     * Dynamically updated on getNumberOfSongs()
     */
    private int numberOfSongs;

    /**
     * The Interpreter.
     */
    private Interpreter interpreter;

    /**
     * The Song list.
     * Key = String Song.getName()
     */
    private Hashtable<String, Song> songList;

    /**
     * The Track list.
     * List used for sequencing tracks since hashtable lacks persistent order
     */
    private List<String> trackList;


    /**
     * Instantiates a new Album.
     *
     * @param pName        the song name
     * @param pGenre       the song genre
     * @param pPrice       the song price
     * @param pInterpreter the song interpreter/artist
     */
    public Album(String pName, String pGenre, double pPrice, Interpreter pInterpreter)
    {
        this.name = pName;
        this.genre = pGenre;
        this.price = pPrice;
        this.interpreter = pInterpreter;
    }

    /**
     * Add song to album.
     *
     * @param pSong the song to added
     * @return true if add is successful, otherwise false
     */
    public boolean addSong(Song pSong)
    {
        boolean success = false;
        try
        {
            if (songList != null)
            {
                String pSongName = pSong.getName();
                songList.put(pSongName, pSong);
                trackList.add(pSongName);
                success = true;
            }
        }
        catch (Exception e)
        {
            System.out.println((e.getMessage()));
            System.out.println("Add Song Failed: Invalid Song");
        }

        return success;
    }


    /**
     * Search Song
     *
     * @param pName the name of the song to search for
     * @return the song if found, null Song if not found
     */
    public Song searchSong(String pName)
    {
        Song searchedSong = null;

        searchedSong = songList.get(pName);

        return searchedSong;
    }

    /**
     * Get longest song.
     *
     * @return the longest song, null if no song exist
     */
    public Song GetLongestSong()
    {
        Song pSong = null;
        Enumeration<String> songNameKeys = songList.keys();
        double longestDuration = -1;
        String longestDurationKey = "";

        while (songNameKeys.hasMoreElements())
        {
            String key = songNameKeys.nextElement();
            double duration = songList.get(key).getDuration();
            if (duration > longestDuration)
            {
                longestDuration = duration;
                longestDurationKey = key;
            }
        }
        pSong = songList.get(longestDurationKey);

        return pSong;
    }

    /**
     * Remove song
     *
     * @param pName the name of the song to remove
     * @return true if removal is successful, otherwise false
     */
    public boolean removeSong(String pName)
    {
        boolean success = false;
        if (songList.containsKey(pName))
        {
            songList.remove(pName);
            trackList.remove(pName);
            success = true;
        }

        return success;
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
     * Gets genre.
     *
     * @return the genre
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Gets number of songs.
     *
     * @return the number of songs
     */
    public int getNumberOfSongs()
    {
        numberOfSongs = songList.size();

        return numberOfSongs;
    }

    /**
     * Gets song number.
     *
     * @param songNumber the song number, n
     * @return the nth song
     */
    public Song getSongNumber(int songNumber)
    {
        Song pSong = null;

        pSong = songList.get(trackList.get(songNumber));

        return pSong;
    }

    /**
     * Gets song 1.
     *
     * @return song 1
     */
    public Song getSong1()
    {
        return getSongNumber(1);
    }

    /**
     * Gets song 2.
     *
     * @return song 2
     */
    public Song getSong2()
    {
        return getSongNumber(1);
    }

    /**
     * Gets song 3.
     *
     * @return song 3
     */
    public Song getSong3()
    {
        return getSongNumber(3);
    }

    /**
     * Gets song 4.
     *
     * @return song 4
     */
    public Song getSong4()
    {
        return getSongNumber(4);
    }

    /**
     * Gets song 5.
     *
     * @return  song 5
     */
    public Song getSong5()
    {
        return getSongNumber(5);
    }
}


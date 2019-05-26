package com.williamhopper;

import java.util.Stack;

/**
 * The type Jukebox.
 * @author William Hopper
 */
public class Jukebox
{
    /**
     * The Number of albums.
     * Dynamically returned
     */
    private int numberOfAlbums;

    /**
     * The Album stack.
     */
    private Stack<Album> albumStack;

    /**
     * Gets number of albums.
     *
     * @return the number of albums
     */
    public int getNumberOfAlbums()
    {
        this.numberOfAlbums = albumStack.size();
        return numberOfAlbums;
    }

    /**
     * Add album boolean.
     *
     * @param pName       the album name
     * @param pGenre      the album genre
     * @param pPrice      the album price
     * @param pInterpeter the album interpreter/artist
     * @return true if successful, otherwise false
     */
    public boolean addAlbum(String pName, String pGenre, double pPrice, Interpreter pInterpeter){
        boolean success = false;

        try
        {
            albumStack.push(new Album(pName, pGenre,pPrice, pInterpeter));
            success = true;
        }catch (Exception e){
            System.out.println(e.getMessage()+"/n");
        }

        return success;
    }

    /**
     * Search album.
     *
     * @param pName the name
     * @return the album if found, otherwise null
     */
    public Album searchAlbum(String pName){
        Album searchedAlbum = null;
        for (Album album: albumStack)
        {
            if (album.getName().equals(pName)){
                searchedAlbum = album;
            }
        }
        return searchedAlbum;
    }

    /**
     * Add song boolean.
     *
     * @param pName      the song name
     * @param pDuration  the song duration
     * @param pNameAlbum the name of the album to add to
     * @return true if successful, otherwise false
     */
    public boolean addSong(String pName, int pDuration, String pNameAlbum){
        boolean success = false;
        Album foundAlbum = searchAlbum(pNameAlbum);
        if (foundAlbum != null){
            foundAlbum.addSong(new Song(pName,pDuration));
            success = true;
        }
        return success;
    }

    /**
     * Get most expensive album.
     *
     * @return the most expensive album
     */
    public Album getMostExpensiveAlbum(){
        Album mostExpensive = null;
        int mostExpensiveValue = Integer.MIN_VALUE;

        for (Album albums : albumStack){
            if (albums.getPrice() > mostExpensiveValue){
                mostExpensive = albums;
            }
        }
        return mostExpensive;
    }

    /**
     * Get least expensive album.
     *
     * @return the least expensive album
     */
    public Album getLeastExpensiveAlbum(){
        Album leastExpensive = null;
        int leastExpensiveValue = Integer.MAX_VALUE;

        for (Album albums : albumStack){
            if (albums.getPrice() < leastExpensiveValue){
                leastExpensive = albums;
            }
        }
        return leastExpensive;
    }

    /**
     * Get longest song in an album.
     *
     * @param pName the album name
     * @return the longest song in Album pName
     */
    public Song getLongestSongInAlbum(String pName){
        Song longestSong = null;
        double longestSongDuration = Double.MIN_VALUE;

        for(Album albums : albumStack){
            Song currentSong = albums.GetLongestSong();
            if (currentSong.getDuration() > longestSongDuration){
                longestSong = currentSong;
            }
        }

        return longestSong;
    }

    /**
     * Remove album boolean.
     *
     * @param pName the album name
     * @return true if removal successful, otherwise false
     */
    public boolean removeAlbum(String pName){
        boolean success = false;

        success = albumStack.remove(searchAlbum(pName));
        return success;
    }

    /**
     * Remove song from album boolean.
     *
     * @param pNameSong  the p name song
     * @param pNameAlbum the p name album
     * @return the boolean
     */
    public boolean removeSongFromAlbum(String pNameSong, String pNameAlbum){
        boolean success = false;
        Album refAlbum = searchAlbum(pNameAlbum);

        if (refAlbum != null){
            success = refAlbum.removeSong(pNameSong);
        }

        return success;
    }
}

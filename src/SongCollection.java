import java.util.Arrays;

/**
 * Song Array Class to hold songs
 * @author Vennela Talluri
 *
 */

public class SongCollection {

    /**
     * The public name of the array holding songs
     */
    private Song [] songs = new Song[5150];

    /**
     * The public name of the number of songs currently in the array
     */
    private int numOfSongs;


    public SongCollection(){
    }

    public Song [] getSongs(){
        return this.songs;
    }

    public void addToSongCollection(int i, Song s){
        songs[i] = s;
        this.numOfSongs=i;
    }

    /**
     * This method gets the total number of songs which is returned by the class variable numOfSongs
     * @param
     * @return the number of songs
     */
    //Total number of songs
    public int getNumOfSongs() {
        return this.numOfSongs;
    }

    /**
     * This method computes average number of words per song
     * @param
     * @return the avg
     */
    public int getAvgNumOfWordsPerSong() {
        int avgNumOfWordsPerSong = 0;
        for (int i = 0; i < numOfSongs-1; i++) {
            avgNumOfWordsPerSong += songs[i].getNumOfWords();
        }
        return avgNumOfWordsPerSong /= numOfSongs;
    }



    /**
     * This method finds the song with the most number of words
     * @param
     * @return the song with the most number of words
     */
    public String getLongestSong() {
        Song longestSong = songs[0];
        for(int i = 1; i < numOfSongs-1; i++) {
            if(songs[i].getNumOfWords()>longestSong.getNumOfWords()) {
                longestSong = songs[i];

            }
        }
        return longestSong.getSongName() + " is the longest with " + longestSong.getNumOfWords() + " words.";
    }

    /**
     * This method finds the song with the least number of words
     * @param
     * @return the song with the least number of words
     */
    public String getShortestSong() {
        Song shortestSong = songs[0];
        for(int i = 1; i < numOfSongs-1; i++) {
            if(songs[i].getNumOfWords()<shortestSong.getNumOfWords()) {
                shortestSong = songs[i];

            }
        }
        System.out.println("hashcode" + shortestSong.getSongName().hashCode());
        return shortestSong.getSongName() + " is the shortest with " + shortestSong.getNumOfWords() + " words.";
    }

    /**
     * This method finds the artist with the longest name
     * @param
     * @return the artist with the longest name
     */
    public String longestArtistName(){
        String longestArtistName = "";
        for(int i = 0; i<numOfSongs; i++){
            if(songs[i].getArtist().length()>longestArtistName.length()){
                longestArtistName=songs[i].getArtist();
            }
        }
        return longestArtistName + " is the artist with the longest name.";
    }

    /**
     * This method finds the artist that appears the most number of times
     * @param
     * @return the artist that apprears the most number of times
     */
    public String MostFtArtist(){
        int highestArtistCount = 0;
        String artistName = "";
        for(int i = 0; i<numOfSongs; i++){
            int artistCount = 0;
            for(int j = i+1; j<numOfSongs; j++){
                if (songs[i].getArtist().equals(songs[j].getArtist())){
                    artistCount++;
                }
            }
            if(artistCount > highestArtistCount){
                highestArtistCount = artistCount;
                artistName = songs[i].getArtist();
            }
        }

        return artistName + " appears " + highestArtistCount + " times.";
    }

    /**
     * This method finds the song that appears more than once
     * @param
     * @return the song that appears more than once
     */
    public String findRepeatingSongs(){
        String repeatingSongs = "";
        boolean songRepeats;
        for(int i = 0; i<numOfSongs; i++){
            songRepeats = false;
            for(int j = i+1; j<numOfSongs; j++){
                if (songs[i].equals(songs[j])){
                    songRepeats = true;
                }
            }
            if (songRepeats){
                repeatingSongs += "\n" + songs[i].getSongName();
            }
        }
        return "The following are songs that repeat in the song collection: " + repeatingSongs;
    }

    public String findRepeatingSongNames(){
        String repeatingSongNames = "";
        boolean songRepeats;
        for(int i = 0; i<numOfSongs; i++){
            songRepeats = false;
            for(int j = i+1; j<numOfSongs; j++){
                if (songs[i].getSongName().equals(songs[j].getSongName())){
                    songRepeats = true;
                }
            }
            if (songRepeats){
                repeatingSongNames += "\n" + songs[i].getSongName();
            }
        }
        return "The following are song names that repeat in the song collection: " + repeatingSongNames;
    }

    public void test() {
        Song s1 = songs[1];
        Song s2 = songs[2];
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(Arrays.toString(s1.getSongName().trim().toCharArray()));
        System.out.println(Arrays.toString(s2.getSongName().trim().toCharArray()));
        System.out.println(s1.equals(s2));
    }
}





//Done: Total number of songs
//Done: Average number of words per song
//Done: Song with the most number of words
//Done: Song with the least number of words
//Done: Artist with the longest name
//Done: Artist that appears the most number of times (must be exact match)
//ToDo: Does any song appear more than once? (must also be exact match)
//
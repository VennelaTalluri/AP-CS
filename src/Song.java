import java.util.Objects;

/**
 * Song Class to hold attributes and methods associated with songs
 * @author Vennela Talluri
 *
 */

public class Song {
    private String songName;
    private String artist;

    private String year;

    private int numOfWords;


    public Song(String songName, String artist, String year, int numOfWords){
        this.songName = songName;
        this.artist = artist;
        this.year = year;
        this.numOfWords = numOfWords;
    }

    public String getSongName(){
        return songName;
    }

    public void setSongName(String songName){
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getNumOfWords() {
        return numOfWords;
    }

    public void setNumOfWords(int numOfWords) {
        this.numOfWords = numOfWords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Song song = (Song) o;
 //       return numOfWords == song.numOfWords && songName.equals(song.songName) && artist.equals(song.artist) && year.equals(song.year);
        return numOfWords == song.numOfWords && Objects.equals(songName, song.songName) && Objects.equals(artist, song.artist) && Objects.equals(year, song.year);
    }

   @Override
   public int hashCode() {
        return Objects.hash(songName, artist, year, numOfWords);
    }

    /*    public boolean equals(Song a){
        if(songName.equals(a.getSongName()) && artist.equals(a.getArtist())
                && year.equals(a.getYear()) && numOfWords == a.getNumOfWords()){
            return true;
        }
        return false;
    }*/

}

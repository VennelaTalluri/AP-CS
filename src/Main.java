public class Main {
    public static void main(String[] args) {
        SongCollection songCollection = new SongCollection();
        FileReader.convertFileToSongCollection(songCollection);
        System.out.println(songCollection.getShortestSong());
        System.out.println(songCollection.getLongestSong());
        System.out.println(songCollection.MostFtArtist());
        System.out.println("total number of songs: " + songCollection.getNumOfSongs());
        System.out.println("avg num of words per song: " + songCollection.getAvgNumOfWordsPerSong());
        System.out.println(songCollection.longestArtistName());
        System.out.println(songCollection.findRepeatingSongs());
        System.out.println(songCollection.findRepeatingSongNames());
        }

}



import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileReader {

    public static void convertFileToSongCollection(SongCollection songCollection) {
        try {
            //ToDo: see why the whole path is being asked
            File myObj = new File("/Users/vennelakirantalluri/Desktop/SongLab/src/songs_new_line.txt");
            Scanner myReader = new Scanner(myObj);

            int i = 0;
            while (myReader.hasNextLine()) {
                String songName = myReader.nextLine();
                String artist = myReader.nextLine();
                String year = myReader.nextLine();
                String numOfWords = myReader.nextLine();
                Song s = new Song(songName, artist, year, Integer.valueOf(numOfWords));
                songCollection.addToSongCollection(i,s);
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


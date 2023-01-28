import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RecordingSort {

    // creating arraylist
   private static ArrayList<Recording> recordingList = new ArrayList<Recording>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Version in production

        for (int i = 1; i <= 5; i++) {
            Recording newRecording = new Recording();

            System.out.println("Please enter the details from recording: " + i);
            System.out.println("");

            System.out.println("Enter the name:");
            newRecording.setRecording(input.next());

            System.out.println("Enter the artist");
            newRecording.setArtist(input.next());

            System.out.println("Please enter the playing time in seconds:");
            newRecording.setPlayingTime(input.nextInt());

            System.out.println("");

            recordingList.add(newRecording);
        }

        // version for testing

        // for (int i = 1; i <= 5; i++) {
        //     Recording newRecording = new Recording();

        //     System.out.println("Please enter the details from recording: " + (i + 1));
        //     System.out.println("");

        //     System.out.println("Enter the name:");
        //     newRecording.setRecording("Recording name" + i);

        //     System.out.println("Enter the artist");
        //     newRecording.setArtist("Artist name" + i);

        //     System.out.println("Please enter the playing time in seconds:");
        //     newRecording.setPlayingTime(i);

        //     System.out.println("");

        //     recordingList.add(newRecording);
        // }

        // sorting the recordings

        System.out.println("Do you want to sort the records by title, artist or playtime?");

        System.out.print("sort by: ");
        String sortOn = input.next();
        System.out.println("");

        if (sortOn.equals("title")) {
           recordNameSort();
        }
        else if (sortOn.equals("artist")) {
            recordArtistSort();
        }
        else if (sortOn.equals("playtime")) {
            recordPlaytimeSort();
        }
        else {
            System.out.println("");
            System.out.println("You did not choose one of the sorting categories. The recordings are in a random order:");
        }
        
        System.out.println("");
        // display all the recordings in the recordingList
        displayRecordings();
        
        
     
        
    }

    public static void displayRecordings() {
        for (Recording recording : recordingList) {
            System.out.println("Records is: " + recording.getRecording());
            System.out.println("Artist is: " + recording.getArtist());
            System.out.println("Playing time is: " + recording.getPlayingTime());
            System.out.println("");
        }
    }

    public static void recordNameSort() {
        Collections.sort(recordingList, Recording.recordingNameComparator);
    }

    public static void recordArtistSort() {
        Collections.sort(recordingList, Recording.recordingArtistComparator);
    }

    public static void recordPlaytimeSort() {
        Collections.sort(recordingList, Recording.recordingPlaytimeComparator);
    }
}

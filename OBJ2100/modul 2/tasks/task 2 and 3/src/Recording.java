import java.util.Comparator;

public class Recording implements Comparable<Recording> {
    private String recording;
    private String artist;
    private int playingTime;

    public void setRecording(String recording) {
        this.recording = recording;
    }

    public String getRecording() {
        return this.recording;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return this.playingTime;
    }

    public static Comparator<Recording> recordingNameComparator = new Comparator<Recording>() {
        @Override
        public int compare(Recording one, Recording two) {
            String rName1=one.getRecording();
            String rName2 = two.getRecording();
            return rName1.compareTo(rName2);
        }
    };

    public static Comparator<Recording> recordingArtistComparator = new Comparator<Recording>() {
        @Override
        public int compare(Recording one, Recording two) {
            String rArtist1=one.getArtist();
            String rArtist2 = two.getArtist();
            return rArtist1.compareTo(rArtist2);
        }
    };

    public static Comparator<Recording> recordingPlaytimeComparator = new Comparator<Recording>() {
        @Override
        public int compare(Recording one, Recording two) {
            Integer rPlaytime1=one.getPlayingTime();
            Integer rPlaytime2 = two.getPlayingTime();
            return rPlaytime1.compareTo(rPlaytime2);
        }
    };

    @Override
    public int compareTo(Recording o) {
        // TODO Auto-generated method stub
        return 0;
    }


    // constructor

    // public Recording(String recording, String artist, int playingTime) {
    //     this.recording = recording;
    //     this.artist = artist;
    //     this.playingTime = playingTime;
    // }
}

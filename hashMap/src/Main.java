import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Song2", "LYRICS");
        trackList.put("Song1", "LYRICS");
        trackList.put("Song4", "LYRICS");
        trackList.put("Song3", "LYRICS");

        String track = trackList.get("Song1");
        System.out.println(track);

        for(String key : trackList.keySet()) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}

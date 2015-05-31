package yulongproductions.com.lyricmuse;

import java.util.Random;

/**
 * Created by Yulong on 5/13/2015.
 */
public class SongBook {

    public String[] lyrics = {
            "\"Hung my head as I lost the war, the sky turned black like a perfect storm.\"",
            "\"You're still all over me like a wine stained dress I can't wear anymore.\"",
            "\"So you can keep me inside the necklace you got when you were sixteen, next to" +
                    " your heartbeat where I should be.\"",
            "\"You and I are a story that never gets old.\"",
    };

    public String getLyric() {
        Random r = new Random();
        int random = r.nextInt(lyrics.length);
        return lyrics[random];
    }
}

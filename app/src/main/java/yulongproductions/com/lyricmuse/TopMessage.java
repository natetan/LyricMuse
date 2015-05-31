package yulongproductions.com.lyricmuse;

import java.util.Random;

/**
 * Created by Yulong on 5/13/2015.
 */
public class TopMessage {

    public String[] messages = {
            "Never stop grooving.",
            "Chord Set: G D Am C.",
            "Best lyrics.",
            "Master the basics!"
    };

    public String getMessage() {
        Random r = new Random();
        int num = r.nextInt(messages.length);
        return messages[num];
    }
}

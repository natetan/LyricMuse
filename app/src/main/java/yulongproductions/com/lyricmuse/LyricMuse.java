package yulongproductions.com.lyricmuse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class LyricMuse extends Activity {

    private SongBook mSongBook = new SongBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private TopMessage mTopMessage = new TopMessage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyric_muse);

        final TextView lyric = (TextView)findViewById(R.id.lyric);
        final TextView top = (TextView)findViewById(R.id.topText);
        final Button showLyricButton = (Button)findViewById(R.id.changeLyricButton);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lyric.setText(mSongBook.getLyric());
                top.setText(mTopMessage.getMessage());
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showLyricButton.setTextColor(color);
            }
        };
        showLyricButton.setOnClickListener(listener);
    }
}

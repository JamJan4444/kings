package de.jan;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import de.game.jan.kings.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class DeckActivity extends AppCompatActivity {

    ImageButton fullscreen_content;
    boolean turn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_deck);
        fullscreen_content = (ImageButton) findViewById(R.id.fullscreen_content);
        fullscreen_content.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),"ImageButton is clicked!", Toast.LENGTH_SHORT).show();
                //int id = getResources().getIdentifier("de.jan:drawable/" + "spades_ace", null, null);

                if(turn == false) {
                    turn = true;
                    fullscreen_content.setImageDrawable(getResources().getDrawable(R.drawable.spades_ace));
                }
                else {
                    turn = false;
                    fullscreen_content.setImageDrawable(getResources().getDrawable(R.drawable.hearts_ace));
                }
            }
        });
    }
}

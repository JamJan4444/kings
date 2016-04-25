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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.jan.Card;

import de.game.jan.kings.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class DeckActivity extends AppCompatActivity {

    ImageButton fullscreen_content;
    ArrayList<Card> deck = new ArrayList<Card>();
    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fillDeck();
        Collections.shuffle(deck);

        setContentView(R.layout.activity_deck);
        fullscreen_content = (ImageButton) findViewById(R.id.fullscreen_content);

        fullscreen_content.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if(pos != 32) {
                    fullscreen_content.setImageDrawable(getResources().getDrawable(deck.get(pos).ref()));
                    pos++;
                }
                else {
                    pos = 0;
                    fullscreen_content.setImageDrawable(getResources().getDrawable(R.drawable.tap));
                    Collections.shuffle(deck);
                    Toast.makeText(getApplicationContext(),"Tap to start the next round! ;)", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void fillDeck(){
        deck.add(Card.SEVENOFDIAMONDS);
        deck.add(Card.EIGHTOFDIAMONDS);
        deck.add(Card.NINEOFDIAMONDS);
        deck.add(Card.TENOFDIAMONDS);
        deck.add(Card.JACKOFDIAMONDS);
        deck.add(Card.QUEENTOFDIAMONDS);
        deck.add(Card.KINGOFDIAMONDS);
        deck.add(Card.ACEOFDIAMONDS);

        deck.add(Card.SEVENOFHEARTS);
        deck.add(Card.EIGHTOFHEARTS);
        deck.add(Card.NINEOFHEARTS);
        deck.add(Card.TENOFHEARTS);
        deck.add(Card.JACKOFHEARTS);
        deck.add(Card.QUEENOFHEARTS);
        deck.add(Card.KINGOFHEARTS);
        deck.add(Card.ACEOFHEARTS);

        deck.add(Card.SEVENOFSPADES);
        deck.add(Card.EIGHTOFSPADES);
        deck.add(Card.NINEOFSPADES);
        deck.add(Card.TENOFSPADES);
        deck.add(Card.JACKOFSPADES);
        deck.add(Card.QUEENTOFSPADES);
        deck.add(Card.KINGOFSPADES);
        deck.add(Card.ACEOFSPADES);

        deck.add(Card.SEVENOFCLUBS);
        deck.add(Card.EIGHTOFCLUBS);
        deck.add(Card.NINEOFCLUBS);
        deck.add(Card.TENOFCLUBS);
        deck.add(Card.JACKOFCLUBS);
        deck.add(Card.QUEENTOFCLUBS);
        deck.add(Card.KINGOFCLUBS);
        deck.add(Card.ACEOFCLUBS);
    }
}

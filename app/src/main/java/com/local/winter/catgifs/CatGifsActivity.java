package com.local.winter.catgifs;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class CatGifsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_gifs);

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.newGifButton);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = "";
                String[] facts = {
                        "Both humans and cats have identical regions in the brain responsible for emotion.",
                        "A cat's jaw has only up and down motion; it does not have any lateral, side to side motion, like dogs and humans.",
                        "Cats with long, lean bodies are more likely to be outgoing, and more protective and vocal than those with a stocky build.",
                        "Tylenol and chocolate are both poisionous to cats.",
                        "The cat's front paw has 5 toes and the back paws have 4. Cats born with 6 or 7 front toes and extra back toes are called polydactl.",
                        "The normal body temperature for a cat is 102 degrees F."
                };

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];

                factLabel.setText(fact);

            }
        };

        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cat_gifs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

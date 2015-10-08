package com.ar4trip.practicelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

public class PracticeLayout_MainActivity extends Activity {

    RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_practice_layout__main);

        relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );

        relativeLayout.setLayoutParams(relativeParams);


        setContentView(relativeLayout);


        Button button = new Button(this);
        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

                buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
                buttonParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                buttonParams.setMargins(0, 0, 0, 54);

                button.setLayoutParams(buttonParams);
                // button.setId(button.generateViewId());
                button.setId(R.id.june_button);
                button.setText(R.string.button_name);

                relativeLayout.addView(button);

        Button nigelButton = new Button(this);
        RelativeLayout.LayoutParams nigelParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // nigelParams.addRule(RelativeLayout.ABOVE, button.getId());
        nigelParams.addRule(RelativeLayout.ABOVE, R.id.june_button);
        nigelParams.addRule(RelativeLayout.ALIGN_END, R.id.june_button);
        nigelParams.setMargins(0, 0 , 0 , 54);
        nigelButton.setLayoutParams(nigelParams);
        nigelButton.setId(R.id.nigels_button);
        nigelButton.setText("Nigels Button");

        relativeLayout.addView(nigelButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_practice_layout__main, menu);
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

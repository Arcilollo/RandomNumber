package org.arci.random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Switch;
import java.util.*;

public class MainActivity extends Activity {

    SeekBar seekbar;
    TextView textview;
    TextView result;
    Button button;
    Button buttonS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random r = new Random();

        seekbar = (SeekBar)findViewById(R.id.seekBar);
        textview = (TextView)findViewById(R.id.Counter);
        result = (TextView)findViewById(R.id.Result);
        button = (Button)findViewById(R.id.button);
        buttonS = (Button)findViewById(R.id.buttonS);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View TextView) {
                result.setText(String.valueOf(r.nextInt(seekbar.getProgress()+1)));
            }
        });

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View TextView) {
                result.setText(String.valueOf(r.nextInt(291334)));
            }
        });

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textview.setText("" + i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}

package fr.utt.if26.nivelet_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    /**
     * salut
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String message = "Bonjour IF26!!!!!!!!!!!!!!!!!!!";
        TextView tx = (TextView) findViewById(R.id.message);
        tx.setText(message);
    }


}

package comd7shah.github.www.valentinecard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by dhrutishah on 15-02-15.
 */
public class Card extends Activity {
    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);

        txtOutput = (TextView) findViewById(R.id.txtOutput);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        txtOutput.setText(name);
    }

}

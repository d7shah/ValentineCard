package comd7shah.github.www.valentinecard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by dhrutishah on 15-02-15.
 */
public class Card extends Activity implements View.OnClickListener {
    TextView txtOutput;
    ImageButton imagebutton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);

        imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        imagebutton2.setOnClickListener(this);

        txtOutput = (TextView) findViewById(R.id.txtOutput);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        txtOutput.setText(name);



    }

    @Override
    public void onClick(View v) {
            Intent intent = new Intent(this, Main.class);
            startActivity(intent);
    }
}
